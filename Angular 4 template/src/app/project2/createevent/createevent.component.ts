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

  users: Array<User> = [];
  host: string;

  newEvent = {
    id: 0,
    eventname: '',
    description: '',
    dateandtime: '',
    capacity: '',
    phonenumber: '',
    attending: 0,
    type: {
      id: 0
    },
    genre: {
      id: 0
    },
    status: {
      id: 3
    },
    location: {
      id: 0
    },
    host: {
      id: 0
    },
  };

  // tslint:disable-next-line:max-line-length
  constructor(private client: HttpClient, private router: Router, private event: Event, private user: User, private cookie: CookieService) { }

  // let username = JSON.parse(this.cookie.get('username'));

  ngOnInit() {
    console.log(this.cookie.get('username'));
    this.client.get('http://localhost:8000/User/CreateEvent')
      .subscribe(
        (succ: Array<User>) => {
          this.users = succ;
        },
        (err) => {
          console.log('failed to load events');
        });
  }


  submitEvent() {
    console.log(this.host);
    if (this.host === this.cookie.get('username')) {
      this.newEvent.status.id = 4;
    }

    this.users.forEach((user, index) => {
      if (user.username === this.host) {
        // tslint:disable-next-line:no-unused-expression
        this.newEvent.location.id = user.address.id;
      }
    });
    this.users.forEach((user, index) => {
      if (user.username === this.cookie.get('username')) {
        // tslint:disable-next-line:no-unused-expression
        this.newEvent.host.id = user.id;
      }
    });
    console.log('NEWEVENT');
    console.log(this.newEvent);
    this.client.post('http://localhost:8000/User/CreateEvent', this.newEvent)
      .subscribe(
        data => {
          this.event = <Event>data;
          alert('Event registered!');
          this.router.navigateByUrl('/pastevents');
        },
        err => {
          alert('failed to submit event');
        }
      );
  }

}
