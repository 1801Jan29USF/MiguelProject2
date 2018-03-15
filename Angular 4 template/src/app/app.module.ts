import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import {AppComponent} from './app.component';
import {NavComponent} from './nav/nav.component';
import { appRoutes } from './routes';
import { CookieService } from 'ngx-cookie-service';
import { User } from './beans/user';
import { HomepageComponent } from './project2/homepage/homepage.component';
import { DashboardComponent } from './Project2/dashboard/dashboard.component';
import { BioComponent } from './Project2/bio/bio.component';
import { SearcheventComponent } from './Project2/searchevent/searchevent.component';
import { CreateeventComponent } from './Project2/createevent/createevent.component';
import { PasteventsComponent } from './Project2/pastevents/pastevents.component';
import { Project2loginComponent } from './Project2/project2login/project2login.component';
import { Project2registerComponent } from './Project2/project2register/project2register.component';
import { AttendeeGuard } from './guard/attendee.guard';
import { HostGuard } from './guard/host.guard';
import { Event } from './beans/event';
import { SearchpipePipe } from './project2/pipe/searchpipe.pipe';
import { GenrepipePipe } from './project2/pipe/genrepipe.pipe';
import { CurrentUser } from './beans/currentuser';






@NgModule({
  imports: [
    BrowserModule,
    HttpModule,
    HttpClientModule,
    NgbModule.forRoot(),
    RouterModule.forRoot(appRoutes, {useHash: true}),
    FormsModule
  ],
  declarations: [
    AppComponent,
    NavComponent,
    HomepageComponent,
    DashboardComponent,
    BioComponent,
    SearcheventComponent,
    CreateeventComponent,
    PasteventsComponent,
    Project2loginComponent,
    Project2registerComponent,
    SearchpipePipe,
    GenrepipePipe,
  ],
  providers: [
    CookieService,
    AttendeeGuard,
    HostGuard,
    User,
    CurrentUser,
    Event

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
