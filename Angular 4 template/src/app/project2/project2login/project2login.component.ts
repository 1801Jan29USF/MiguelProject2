import { Component, OnInit } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-project2login',
  templateUrl: './project2login.component.html',
  styleUrls: ['./project2login.component.css']
})

export class Project2loginComponent implements OnInit {

  credential = {
    username: '',
    password: '',
    role: 0
  };

  constructor() { }

  ngOnInit() {
  }

}
