import { Component, OnInit } from '@angular/core';
import { Event } from '../../beans/event';
import { HttpClient } from '@angular/common/http';
import { CookieService } from 'ngx-cookie-service';
import { User } from '../../beans/user';



@Component({
  selector: 'app-pastevents',
  templateUrl: './pastevents.component.html',
  styleUrls: ['./pastevents.component.css']
})
export class PasteventsComponent implements OnInit {

  Approve = {
    status: 0,
    eventid: 0
  };


  filteredevents: Array<Event> = [];
  events: Array<Event> = [];
  username: string;
  useraddress: number;
  role: number;


  constructor(private client: HttpClient, private cookie: CookieService,
    private user: User, private event: Event) { }

  Approval(status: number, id: number) {

    this.Approve.status = status;
    this.Approve.eventid = id;
    this.client.post('http://localhost:8000/events/pastEvents/', this.Approve).subscribe(
      (succ) => {
        alert('Event has been approved');
        this.ngOnInit();
      },
      (err) => {
        alert('Event has been denied');
        this.ngOnInit();
      }
    );
  }


  getCurrentAddress() {
    this.events.forEach((event, index) => {
      console.log('ALL EVENTS:::: ');
      console.log(this.events);
      console.log('who am i ' + event.host.username);
      if (event.host.username === this.cookie.get('username')) {
        this.useraddress = event.location.id;
        this.role = event.host.role.id;
        console.log('Current User Role' + this.role);
        console.log('Current User Address ' + this.useraddress);
        console.log('Current User Username ' + this.cookie.get('username'));
      }

    });
  }

  ngOnInit() {
    this.client.get('http://localhost:8000/events/pastEvents/' + this.cookie.get('username'))
      .subscribe(
        (succ: Array<Event>) => {
          this.events = succ;
          this.getCurrentAddress();
          this.events.pop();
          this.filterByAttended();
        },
        (err) => {
          console.log('failed to load events');
        });
  }

  // events that user hosted as his own house
  filterByHosted() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.host.username === this.cookie.get('username') && event.location.id === this.useraddress) {
        this.filteredevents.push(event);
      }
    });
  }


  filterByPending() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.host.username === this.cookie.get('username') && event.location.id !== this.useraddress
        && event.status.status === 'PENDING') {
        this.filteredevents.push(event);
      }
    });
  }

  filterByApproved() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.host.username === this.cookie.get('username') && event.location.id !== this.useraddress
        && event.status.status === 'APPROVED') {
        this.filteredevents.push(event);
      }
    });
  }

  filterByDenied() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.status.status === 'DENIED' && event.location.id !== this.useraddress
        && event.host.username === this.cookie.get('username')
      ) {
        this.filteredevents.push(event);
      }
    });
  }
  filterByRequest() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.location.id === this.useraddress && (this.cookie.get('username') !== event.host.username)) {
        this.filteredevents.push(event);
      }
    });
  }


  filterByAttended() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      console.log(event);
      if (event.userevents !== undefined || event.userevents.length !== 0) {
        console.log('miguel');
        console.log(event);
        event.userevents.forEach((user, index2) => {
          if (user.username === this.cookie.get('username')) {
            this.filteredevents.push(event);
          }
        });


      }

    });

  }



}
