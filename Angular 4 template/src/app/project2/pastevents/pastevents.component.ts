import { Component, OnInit } from '@angular/core';
import { Event } from '../../beans/event';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-pastevents',
  templateUrl: './pastevents.component.html',
  styleUrls: ['./pastevents.component.css']
})
export class PasteventsComponent implements OnInit {

  events: Array<Event> = [];
  constructor(private client: HttpClient) { }

  ngOnInit() {
    console.log(this.events);
    this.client.get('http://localhost:8000/events/searchEvents')
    .subscribe(
      (succ: Array<Event>) => {
        this.events = succ;
      },
      (err) => {
        console.log('failed to load events');
      } );
  }

}
