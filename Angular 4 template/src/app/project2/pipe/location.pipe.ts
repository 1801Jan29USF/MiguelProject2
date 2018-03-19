import { Pipe, PipeTransform } from '@angular/core';
import { Event } from '../../beans/event';

@Pipe({
  name: 'location'
})
export class LocationPipe implements PipeTransform {

  transform(events: Array<Event>, city: string): Array<Event> {
    if (!city) {
      return events;
  }
  if (!events) {
      return [];
  }
  return events.filter(event => event.location.city.toLowerCase().includes(city.toLowerCase()));

}
}
