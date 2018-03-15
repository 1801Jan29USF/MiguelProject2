import { Pipe, PipeTransform } from '@angular/core';
import { Event } from '../../beans/event';

@Pipe({
  name: 'searchpipe'
})
export class SearchpipePipe implements PipeTransform {

  transform(events: Array<Event>, type: string, genre: string): Array<Event> {
   if ( events.filter(event => event.type.type  === type)) {
    return events.filter( event => event.type.type  === type);

  }
  }

}
