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


  filteredevents: Array<Event> = [];
  events: Array<Event> = [];
  username: string;

  constructor(private client: HttpClient, private cookie: CookieService, private user: User, private event: Event) { }


  ngOnInit() {
    this.client.get('http://localhost:8000/events/searchEvents')
      .subscribe(
        (succ: Array<Event>) => {
          this.events = succ;
          console.log(this.events);
        },
        (err) => {
          console.log('failed to load events');
        });
  }

  //events that user hosted as his own house
  filterByHosted() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.host.username === this.cookie.get('username')) {
        this.filteredevents.push(event);
      }
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

}
