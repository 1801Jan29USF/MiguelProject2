import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { UserComponentComponent } from './user-component/user-component.component';
import { EventComponentComponent } from './event-component/event-component.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { LoginComponentComponent } from './login-component/login-component.component';
import { RegisterComponentComponent } from './register-component/register-component.component';
import { SearchComponentComponent } from './search-component/search-component.component';
import { PastEventsComponentComponent } from './past-events-component/past-events-component.component';
import { DashboardComponentComponent } from './dashboard-component/dashboard-component.component';
import { MapComponentComponent } from './map-component/map-component.component';
import { AgmCoreModule} from '@agm/core';


@NgModule({
  declarations: [
    AppComponent,
    UserComponentComponent,
    EventComponentComponent,
    HomeComponentComponent,
    LoginComponentComponent,
    RegisterComponentComponent,
    SearchComponentComponent,
    PastEventsComponentComponent,
    DashboardComponentComponent,
    MapComponentComponent
  ],
  imports: [
    BrowserModule,
    AgmCoreModule.forRoot({
      apiKey: ''
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
