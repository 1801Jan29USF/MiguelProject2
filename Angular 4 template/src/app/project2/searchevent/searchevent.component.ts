import { Component, OnInit } from '@angular/core';
import { Event } from '../../beans/event';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-searchevent',
  templateUrl: './searchevent.component.html',
  styleUrls: ['./searchevent.component.css']
})

export class SearcheventComponent implements OnInit {

  Attending = {
    attending: 0,
    username: '',
    eventid: 0
  };

  events: Array<Event> = [];
  typeFilter = '';
  cityFilter = '';
  useraddress: number;
  filteredevents: Array<Event> = [];

  constructor(private client: HttpClient, private router: Router, private event: Event, private cookie: CookieService) { }



  getCurrentAddress() {
    this.events.forEach((event, index) => {
      console.log('ALL EVENTS:::: ');
      console.log(this.events);
      console.log('who am i ' + event.host.username);
      if (event.host.username === this.cookie.get('username')) {
        this.useraddress = event.location.id;
        console.log('Current User Address ' + this.useraddress);
        console.log('Current User Username ' + this.cookie.get('username'));
      }

    });
  }

  ngOnInit() {
    this.client.get('http://localhost:8000/events/searchEvents/' + this.cookie.get('username'))
      .subscribe(
        (succ: Array<Event>) => {
          this.events = succ;
          this.getCurrentAddress();
          this.events.pop();
          this.filterByHouse();

        },
        (err) => {
          console.log('failed to load events');
        });
  }

  Approved(attending: number, id: number) {
    this.Attending.username = this.cookie.get('username');
    this.Attending.attending = attending;
    this.Attending.eventid = id;
    console.log(this.Attending.username + ' ' + this.Attending.attending + ' ' + this.Attending.eventid);
    this.client.post('http://localhost:8000/events/searchEvents', this.Attending).subscribe(
      (succ) => {
        this.ngOnInit();
      },
      (err) => {
        alert('Failed to Attend Event');

      }
    );
  }
  filterByHouse() {
    this.filteredevents = [];
    this.events.forEach((event, index) => {
      if (event.host.username !== this.cookie.get('username') && event.location.id !== this.useraddress) {
        this.filteredevents.push(event);
      }
    });
  }
}
