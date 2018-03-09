import { Component, OnInit } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-project2register',
  templateUrl: './project2register.component.html',
  styleUrls: ['./project2register.component.css']
})
export class Project2registerComponent implements OnInit {

  newUser = {
    role: 0,
    firstname: '',
    lastname: '',
    username: '',
    password: '',
    email: '',
    description: '',
    phonenumber: '',

  };


  constructor() { }

  ngOnInit() {
  }

}
