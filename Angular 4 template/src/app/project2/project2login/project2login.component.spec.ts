import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Project2loginComponent } from './project2login.component';

describe('Project2loginComponent', () => {
  let component: Project2loginComponent;
  let fixture: ComponentFixture<Project2loginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Project2loginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Project2loginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
