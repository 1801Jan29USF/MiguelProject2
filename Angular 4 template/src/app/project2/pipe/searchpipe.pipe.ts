import { Pipe, PipeTransform } from '@angular/core';
import { Event } from '../../beans/event';

@Pipe({
  name: 'searchpipe'
})
export class SearchpipePipe implements PipeTransform {

  transform(events: Array<Event>, type: string, genre: string, city: string): Array<Event> {
    if (events && events.length) {
        return events.filter(event => {
            if (type && event.type.type.toLowerCase().indexOf(type.toLowerCase()) === -1){
                return false;
            }
            if (genre && event.genre.genre.toLowerCase().indexOf(genre.toLowerCase()) === -1){
                return false;
            }
            if (city && event.location.city.toLowerCase().indexOf(city.toLowerCase()) === -1){
                return false;
            }
            return true;
       });
    }
    // tslint:disable-next-line:one-line
    else {
        return events;
    }
  }

  }
