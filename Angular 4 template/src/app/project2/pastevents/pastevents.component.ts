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


  constructor(private client: HttpClient, private cookie: CookieService,
    private user: User, private event: Event) { }

  Approval(status: number, id: number) {

    this.Approve.status = status;
    this.Approve.eventid = id;
    this.client.post('http://localhost:8000/events/pastEvents/', this.Approve).subscribe(
      (succ) => {
        this.ngOnInit();
      },
      (err) => {
        alert('Failed to Approve');
      }
    );
  }


  getCurrentAddress() {
    this.events.forEach((event, index) => {

      if (event.host.username === this.cookie.get('username')) {
        this.useraddress = event.host.id;
        this.events.pop();
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
          console.log(this.events);
          this.getCurrentAddress();
          this.filterByHosted();
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
      if (event.status.status === 'DENIED' && event.host.username !== this.cookie.get('username') 
      && event.location.id === this.useraddress) {
        this.filteredevents.push(event);
      }
    });
  }
  filterByRequest() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.location.id !== this.useraddress && (this.cookie.get('username') !== event.host.username)) {
        this.filteredevents.push(event);
      }
    });
  }
}
