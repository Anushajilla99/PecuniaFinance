import { Component, OnInit } from '@angular/core';
import { MyserviceService, Customerdata } from '../myservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 
  constructor(private ser:MyserviceService,private router:Router) { }

  msg:string="Enter Correct CustomerName and Password";
  ngOnInit(): void {
  }
  onSubmit(c:Customerdata){
    this.ser.login(c).subscribe(
      customers=>{
        console.log(customers);
        if(customers=="true")
            this.router.navigate(['app-home']);
        else
           return this.msg;
      }
    );
  }
}
