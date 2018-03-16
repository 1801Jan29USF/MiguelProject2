import { Pipe, PipeTransform } from '@angular/core';
import { Event } from '../../beans/event';

@Pipe({
  name: 'locationpipe'
})
export class LocationpipePipe implements PipeTransform {

  transform(events: Array<Event>, city: string): Array<Event> {
    return events.filter( event => event.location  === 0);
  }

}



