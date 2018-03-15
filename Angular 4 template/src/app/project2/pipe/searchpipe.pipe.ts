import { Pipe, PipeTransform } from '@angular/core';
import { Event } from '../../beans/event';

@Pipe({
  name: 'searchpipe'
})
export class SearchpipePipe implements PipeTransform {

  transform(events: Array<Event>, type: string): Array<Event> {
    return events.filter( event => event.type.type  === type);
  }

}
