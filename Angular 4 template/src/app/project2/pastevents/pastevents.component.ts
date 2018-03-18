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
    username: '',
    id: 0
  };


  filteredevents: Array<Event> = [];
  events: Array<Event> = [];
  username: string;
  useraddress: number;


  constructor(private client: HttpClient, private cookie: CookieService, 
    private user: User, private event: Event) { }

    Approval(status: number, id: number) {

      this.Approve.username = this.cookie.get('username');
      this.Approve.status = status;
      this.Approve.id = id;
      this.client.post('http://localhost:8000/events/searchEvents', this.Approve ).subscribe(
     (succ) => {
       this.ngOnInit();
     },
     (err) => {
       alert('Failed to Approve');
     }
      );
     }

// events that user hosted as his own house
filterByHosted() {
  this.filteredevents = [];
  this.events.forEach((event, index) => {
    if (event.host.username === this.cookie.get('username')) {
      this.filteredevents.push(event);
    }
  });
}

getCurrentAddress() {
  this.events.forEach((event, index) => {

    if (event.host.username === this.cookie.get('username')) {
      this.useraddress = event.location.id;
      this.events.pop();
      console.log(this.useraddress);
    }

  });
}


  ngOnInit() {

    this.client.get('http://localhost:8000/events/searchEvents/' + this.cookie.get('username'))
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


  filterByPending() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.status.status === 'PENDING') {
        this.filteredevents.push(event);
      }
    });
  }

  filterByApproved() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.status.status === 'APPROVED') {
        this.filteredevents.push(event);
      }
    });
  }

  filterByDenied() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.status.status === 'DENIED') {
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


  filterByMyAddress() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.location ) {
        this.filteredevents.push(event);
      }
    });
  }
}
