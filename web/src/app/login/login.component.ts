import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Router } from '@angular/router';


// Do not import from 'firebase' as you'll lose the tree shaking benefits


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  private router;

  constructor(router :Router) {
    this.router = router;
  }

  ngOnInit() {

  }

  validateAuth() {
    this.router.navigate(['/index']);
  }

}
