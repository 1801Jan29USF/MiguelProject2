import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PastEventsComponentComponent } from './past-events-component.component';

describe('PastEventsComponentComponent', () => {
  let component: PastEventsComponentComponent;
  let fixture: ComponentFixture<PastEventsComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PastEventsComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PastEventsComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
