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
import { FirstComponent } from './components/first/first.component';
import { SecondComponent } from './components/second/second.component';
import { ClickerComponent } from './components/clicker/clicker.component';
import { HeroComponent } from './components/hero/hero.component';
import { HeroesComponent } from './components/heroes/heroes.component';
import { PipeDemoComponent } from './components/pipe-demo/pipe-demo.component';
import { HeroPowerPipe } from './pipes/hero-power.pipe';
import { HeroService } from './services/hero.service';
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
import { CookieService } from 'angular2-cookie/services/cookies.service';
import { LoggedInGuard } from './guard/logged-in.guard';
import { MenuComponent } from './main-menu/menu/menu.component';
import { HomeComponent } from './home/home/home.component';
import { SubmitticketComponent } from './submitticket/submitticket/submitticket.component';
import { PendingComponent } from './pending/pending/pending.component';
import { ChangeroleComponent } from './changerole/changerole/changerole.component';
import { User } from './beans/user';
import { EmployeeComponent } from './components/employee/employee.component';
import { HomepageComponent } from './project2/homepage/homepage.component';
import { DashboardComponent } from './Project2/dashboard/dashboard.component';
import { BioComponent } from './Project2/bio/bio.component';
import { SearcheventComponent } from './Project2/searchevent/searchevent.component';
import { CreateeventComponent } from './Project2/createevent/createevent.component';
import { PasteventsComponent } from './Project2/pastevents/pastevents.component';
import { Project2loginComponent } from './Project2/project2login/project2login.component';
import { Project2registerComponent } from './Project2/project2register/project2register.component';




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
    FirstComponent,
    SecondComponent,
    ClickerComponent,
    HeroComponent,
    HeroesComponent,
    PipeDemoComponent,
    HeroPowerPipe,
    ParentComponent,
    Child1Component,
    Child2Component,
    Child3Component,
    Child4Component,
    Child5Component,
    Child6Component,
    ParamRouteComponent,
    ParamParentComponent,
    PokemonComponent,
    TicketsComponent,
    MenuComponent,
    HomeComponent,
    SubmitticketComponent,
    PendingComponent,
    ChangeroleComponent,
    EmployeeComponent,
    HomepageComponent,
    DashboardComponent,
    BioComponent,
    SearcheventComponent,
    CreateeventComponent,
    PasteventsComponent,
    Project2loginComponent,
    Project2registerComponent,
  ],
  providers: [
    HeroService,
    CookieService,
    LoggedInGuard,
    User

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
