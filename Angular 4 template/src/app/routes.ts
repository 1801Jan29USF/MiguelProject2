import { Routes } from '@angular/router';
import { CreateeventComponent } from './Project2/createevent/createevent.component';
import { BioComponent } from './Project2/bio/bio.component';
import { PasteventsComponent } from './Project2/pastevents/pastevents.component';
import { SearcheventComponent } from './Project2/searchevent/searchevent.component';
import { Project2registerComponent } from './Project2/project2register/project2register.component';
import { Project2loginComponent } from './Project2/project2login/project2login.component';
import { HostGuard } from './guard/host.guard';
import { AttendeeGuard } from './guard/attendee.guard';

export const appRoutes: Routes = [
  {
    path: 'project2register',
    component: Project2registerComponent
  },
  {
    path: 'project2login',
    component: Project2loginComponent
  },
  {
    path: 'createevent',
    component: CreateeventComponent,
    canActivate: [
      HostGuard
    ]
  },
  {
    path: 'bio',
    component: BioComponent,
    canActivate: [
      AttendeeGuard,
      HostGuard
    ]
  },
  {
    path: 'pastevents',
    component: PasteventsComponent,
    canActivate: [
      AttendeeGuard,
      HostGuard
    ]
  },
  {
    path: 'searchevent',
    component: SearcheventComponent,
    canActivate: [
      AttendeeGuard,
      HostGuard
    ]
  },
  {
    path: '**',
    pathMatch: 'full',
    redirectTo: 'project2login'
  }
];
