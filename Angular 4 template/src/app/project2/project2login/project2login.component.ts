import { Component, OnInit } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { Router } from '@angular/router';
import { User } from '../../beans/user';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-project2login',
  templateUrl: './project2login.component.html',
  styleUrls: ['./project2login.component.css']
})

export class Project2loginComponent implements OnInit {

  credential = {
    username: '',
    password: '',
  };

  constructor(private client: HttpClient, private router: Router, private user: User) { }

  ngOnInit() {
  }

  Login() {
    this.client.post('http://localhost:8000/Login', this.credential) // {withCredentials: true})
      .subscribe(
        data => {
          this.user = <User>data;
          alert(this.credential.username + ' logged in');
          if (this.user.role === 1) {
            this.router.navigateByUrl('/dashboard');
          } else if (this.user.role === 2) {
            this.router.navigateByUrl('/dashboard');
          }
        },
        err => {
          alert('failed to log in');
        }
      );
  }
}
