import { Component, OnInit } from '@angular/core';
import { User } from '../../beans/user';
import { HttpClient } from '@angular/common/http';
import { CookieService } from 'ngx-cookie-service';


@Component({
  selector: 'app-bio',
  templateUrl: './bio.component.html',
  styleUrls: ['./bio.component.css']
})
export class BioComponent implements OnInit {



  constructor(private client: HttpClient, private cookie: CookieService, private user: User) { }

 

  username = this.cookie.get('username');
  ngOnInit() {
  
    this.client.get('http://localhost:8000/User/Profile/' + this.username)
      .subscribe(
        data => {
          console.log(data);
          this.user = <User>data;
        },
        (err) => {
          console.log('failed to load profile');
        });
  }

}
