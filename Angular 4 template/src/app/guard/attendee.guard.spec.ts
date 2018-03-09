import { TestBed, async, inject } from '@angular/core/testing';

import { AttendeeGuard } from './attendee.guard';

describe('AttendeeGuard', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AttendeeGuard]
    });
  });

  it('should ...', inject([AttendeeGuard], (guard: AttendeeGuard) => {
    expect(guard).toBeTruthy();
  }));
});
