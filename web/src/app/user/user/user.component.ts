import { Component, OnInit } from '@angular/core';
import { UserService } from './service/user.service';
import { User } from './service/user';
import { Observable } from 'rxjs/Rx';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users: User[];

  constructor(private userService: UserService) { }

  ngOnInit() {
    
  }

  ngAfterViewInit(){
    this.loadUsers();

    console.log("Depois");
    console.log(this.users);
  }


  loadUsers() {
    this.userService.getUsers()
      .subscribe(
      data => { this.users = data },
      error => { alert(error) }
      );
    
  }



}