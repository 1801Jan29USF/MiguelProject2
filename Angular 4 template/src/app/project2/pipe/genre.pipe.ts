import { Pipe, PipeTransform } from '@angular/core';
import { Event } from '../../beans/event';

@Pipe({
  name: 'genre'
})
export class GenrePipe implements PipeTransform {

  transform(events: Array<Event>, genre: string): Array<Event> {
    if (!genre) {
      return events;
  }
  if (!events) {
      return [];
  }
  if (genre === null) {
     return events;
  }
  return events.filter(event => event.genre.genre.toLowerCase().includes(genre.toLowerCase()));

}
}
