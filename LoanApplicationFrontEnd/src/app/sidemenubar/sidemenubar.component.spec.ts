import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SidemenubarComponent } from './sidemenubar.component';

describe('SidemenubarComponent', () => {
  let component: SidemenubarComponent;
  let fixture: ComponentFixture<SidemenubarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SidemenubarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SidemenubarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
