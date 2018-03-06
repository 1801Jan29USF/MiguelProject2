import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-map-component',
  templateUrl: './map-component.component.html',
  styleUrls: ['./map-component.component.css']
})
export class MapComponentComponent implements OnInit {
  lat: number = 42.279594;
  lng: number = -83.732124;
  constructor() { }

  ngOnInit() {
  }

}
