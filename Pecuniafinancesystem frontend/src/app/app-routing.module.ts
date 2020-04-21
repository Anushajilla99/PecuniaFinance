import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LogoutComponent } from './logout/logout.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';


const routes: Routes = [
  {path:'app-login',component:LoginComponent},
  {path:'app-signup',component:SignupComponent},
  {path:'app-logout',component:LogoutComponent},
  {path:'app-home',component:HomeComponent},
  {path:'app-add-customer',component:AddCustomerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
