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
    id: 0
  };

  events: Array<Event> = [];
  typeFilter = '';
  genreFilter = '';
  cityFilter = '';

  constructor(private client: HttpClient, private router: Router, private event: Event, private cookie: CookieService) { }

  Approved(attending: number, id: number) {

    this.Attending.username = this.cookie.get('username');
    this.Attending.attending = attending;
    this.Attending.id = id;
    this.client.post('http://localhost:8000/events/searchEvents', this.Attending ).subscribe(
   (succ) => {
     this.ngOnInit();
   },
   (err) => {
     alert('Failed to RSVP');
   }
    );
   }

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

}
