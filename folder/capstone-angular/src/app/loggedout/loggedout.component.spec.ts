import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoggedoutComponent } from './loggedout.component';

describe('LoggedoutComponent', () => {
  let component: LoggedoutComponent;
  let fixture: ComponentFixture<LoggedoutComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LoggedoutComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LoggedoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
