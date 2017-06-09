import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { User } from './user';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class UserService {

  constructor(private http: Http) { }

  public getUsers(): Observable<User[]> {
    let url = 'http://localhost:8080/scheduling-server-0.0.1/rest/user';
    return this.http.get(url)
                    .map(res=>res.json())
                    .catch(err=>{
                       throw new Error(err.message);  
                    });
 } 

}
