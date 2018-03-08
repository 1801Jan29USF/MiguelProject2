import { Routes } from '@angular/router';
import { FirstComponent } from './components/first/first.component';
import { SecondComponent } from './components/second/second.component';
import { HeroesComponent } from './components/heroes/heroes.component';
import { ClickerComponent } from './components/clicker/clicker.component';
import { PipeDemoComponent } from './components/pipe-demo/pipe-demo.component';
import { ParentComponent } from './components/parent/parent.component';
import { Child1Component } from './componenets/parent/child1/child1.component';
import { Child2Component } from './components/parent/child2/child2.component';
import { Child3Component } from './components/parent/child3/child3.component';
import { Child4Component } from './components/parent/child4/child4.component';
import { Child5Component } from './components/parent/child5/child5.component';
import { Child6Component } from './components/parent/child6/child6.component';
import { ParamRouteComponent } from './components/param-route/param-route.component';
import { ParamParentComponent } from './components/param-parent/param-parent.component';
import { PokemonComponent } from './components/pokemon/pokemon.component';
import { TicketsComponent } from './components/tickets/tickets.component';
import { LoggedInGuard } from './guard/logged-in.guard';
import { MenuComponent } from './main-menu/menu/menu.component';
import { HomeComponent } from './home/home/home.component';
import { SubmitticketComponent } from './submitticket/submitticket/submitticket.component';
import { PendingComponent } from './pending/pending/pending.component';
import { ChangeroleComponent } from './changerole/changerole/changerole.component';
import { EmployeeComponent } from './components/employee/employee.component';
import { HomepageComponent } from './project2/homepage/homepage.component';
import { DashboardComponent } from './Project2/dashboard/dashboard.component';
import { CreateeventComponent } from './Project2/createevent/createevent.component';
import { BioComponent } from './Project2/bio/bio.component';
import { PasteventsComponent } from './Project2/pastevents/pastevents.component';
import { SearcheventComponent } from './Project2/searchevent/searchevent.component';
import { Project2registerComponent } from './Project2/project2register/project2register.component';
import { Project2loginComponent } from './Project2/project2login/project2login.component';

export const appRoutes: Routes = [
  {
    path: 'first',
    component: FirstComponent
  },
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
    path: 'employee',
    component: EmployeeComponent
  },
  {
    path: 'changerole',
    component: ChangeroleComponent
  },
  {
    path: 'tickets',
    component: TicketsComponent,
  },
  {
    path: 'submitticket',
    component: SubmitticketComponent,
  },
  {
    path: 'pending',
    component: PendingComponent,
  },
   {
    path: 'mainmenu',
    component: MenuComponent,
  },
  {
    path: 'home',
    component: HomeComponent,
  },
  {
    path: 'second',
    component: SecondComponent
  },
  {
    path: 'heroes',
    component: HeroesComponent
  },
  {
    path: 'clicker',
    component: ClickerComponent,
  },
  {
    path: 'pipe',
    component: PipeDemoComponent
  },
  {
    path: 'param/:id/:name',
    component: ParamRouteComponent
  },
  {
    path: 'pokemon',
    component: PokemonComponent
  },
  {
    path: 'parent',
    component: ParentComponent,
    children: [
      {
        path: 'child1',
        component: Child1Component
      },
      {
        path: 'child2',
        component: Child2Component
      },
      {
        path: 'child3',
        component: Child3Component
      },
      {
        path: 'child4',
        component: Child4Component
      },
      {
        path: 'child5',
        component: Child5Component
      },
      {
        path: 'child6',
        component: Child6Component
      },
      {
        path: '**',
        pathMatch: 'full',
        redirectTo: '/parent'
      }
    ]
  },
  {
    path: '**',
    pathMatch: 'full',
    redirectTo: 'homepage'
  }
];
