import { Component, OnInit } from '@angular/core';
import { MyserviceService } from '../myservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private ser:MyserviceService,private router:Router ) { }

  ngOnInit(): void {
    this.ser.logOut();
    this.router.navigate(['app-login'])
  }

}
