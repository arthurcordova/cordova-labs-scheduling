import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  toogleMenu() {
    if (document.getElementById('drawer').style.left != '0px') {
      document.getElementById('drawer').style.left = '0px';
    } else {
      document.getElementById('drawer').style.left = '-400px';
    }
  }
}
