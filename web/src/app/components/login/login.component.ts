import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Router } from '@angular/router';


// Do not import from 'firebase' as you'll lose the tree shaking benefits
import * as firebase from 'firebase/app';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  private authState: Observable<firebase.User>;
  private currentUser: firebase.User;
  private router;

  constructor(router :Router) {
    this.router = router;
  }

  ngOnInit() {

  }

  validateAuth() {
    this.router.navigateByUrl('/dashboard');
  }

}
