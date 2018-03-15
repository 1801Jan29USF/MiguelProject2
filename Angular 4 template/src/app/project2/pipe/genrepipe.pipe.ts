import { Pipe, PipeTransform } from '@angular/core';
import { Event } from '../../beans/event';

@Pipe({
  name: 'genrepipe'
})
export class GenrepipePipe implements PipeTransform {

  transform(events: Array<Event>, genre: string): Array<Event> {
    return events.filter( event => event.genre.genre  === genre);
  }

}
