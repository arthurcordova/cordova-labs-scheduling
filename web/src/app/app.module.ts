import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UserComponent } from './user/user/user.component';

import { UserService } from './user/user/service/user.service';
import { IndexComponent } from './index/index.component';

const appRoutes: Routes = [
  {
    path: 'index',
    component: IndexComponent,
    children: [
      { path: 'dashboard', component: IndexComponent },
      { path: 'users', component: UserComponent }
    ]
  },
  { path: '', component: LoginComponent }


];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DashboardComponent,
    UserComponent,
    IndexComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
