import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Project2registerComponent } from './project2register.component';

describe('Project2registerComponent', () => {
  let component: Project2registerComponent;
  let fixture: ComponentFixture<Project2registerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Project2registerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Project2registerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
