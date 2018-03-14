import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Event } from '../../beans/event';
import { User } from '../../beans/user';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-createevent',
  templateUrl: './createevent.component.html',
  styleUrls: ['./createevent.component.css']
})
export class CreateeventComponent implements OnInit {

  newEvent = {
    eventname: '',
    description: '',
    dateandtime: '',
    capacity: '',
    phonenumber: '',
    type: {
      id: 0
    },
    genre: {
      id: 0
    },
    status: {
      id: 4
    },
    location: {
      id: this.user.address,
      street: '',
      city: '',
      state: '',
      zipcode: ''
    },
    host: {
      id: this.user.id
      }
  };

  username: String;
  // tslint:disable-next-line:max-line-length
  constructor(private client: HttpClient, private router: Router, private event: Event, private user: User, private cookie: CookieService) { }

  // let username = JSON.parse(this.cookie.get('username'));

  ngOnInit() {
    this.username = JSON.stringify(this.cookie.get('username'));
  }

  submitEvent() {
    this.client.get('http://localhost:8000/User/CreateEvent/{username}' + this.username)
    .subscribe(
    data => {
      this.user = <User>data;
    }
    );

    console.log(this.newEvent);
    this.client.post('http://localhost:8000/User/CreateEvent', this.newEvent)
    .subscribe(
      data => {
       this.event = <Event>data;
        alert('Event registered!');
        this.router.navigateByUrl('/dashboard');
      },
      err => {
        alert('failed to submit event');
      }
    );
  }

}
