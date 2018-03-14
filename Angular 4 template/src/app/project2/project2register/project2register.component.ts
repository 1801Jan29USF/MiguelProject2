import { Component, OnInit } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { User } from '../../beans/user';


@Component({
  selector: 'app-project2register',
  templateUrl: './project2register.component.html',
  styleUrls: ['./project2register.component.css']
})
export class Project2registerComponent implements OnInit {

  newUser = {
    firstname: '',
    lastname: '',
    username: '',
    password: '',
    email: '',
    bio: '',
    phonenumber: '',
    role: {
      id: 2
    },
    address: {
      id: 0,
      street: '',
      city: '',
      state: '',
      zipcode: ''
    }
  };


  constructor(private client: HttpClient, private router: Router, private user: User) { }

  ngOnInit() {
  }

register() {
  console.log(this.newUser);
  this.client.post('http://localhost:8000/register', this.newUser) // {withCredentials: true})
  .subscribe(
    data => {
      this.user = <User>data;
      alert(this.newUser.username + ' registered! ');
        this.router.navigateByUrl('/pastevents');
    
    },
    err => {
      alert('failed to register');
    }
  );
}
}
