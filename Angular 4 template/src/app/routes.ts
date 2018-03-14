import { Routes } from '@angular/router';
import { HomepageComponent } from './project2/homepage/homepage.component';
import { DashboardComponent } from './Project2/dashboard/dashboard.component';
import { CreateeventComponent } from './Project2/createevent/createevent.component';
import { BioComponent } from './Project2/bio/bio.component';
import { PasteventsComponent } from './Project2/pastevents/pastevents.component';
import { SearcheventComponent } from './Project2/searchevent/searchevent.component';
import { Project2registerComponent } from './Project2/project2register/project2register.component';
import { Project2loginComponent } from './Project2/project2login/project2login.component';
import { HostGuard } from './guard/host.guard';

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
    path: 'homepage',
    component: HomepageComponent
  },
  {
    path: 'dashboard',
    component: DashboardComponent
  },
  {
    path: 'createevent',
    component: CreateeventComponent
  },
  {
    path: 'bio',
    component: BioComponent
  },
  {
    path: 'pastevents',
    component: PasteventsComponent
  },
  {
    path: 'searchevent',
    component: SearcheventComponent
  },
  {
    path: '**',
    pathMatch: 'full',
    redirectTo: 'homepage'
  }
];
