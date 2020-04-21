import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MyserviceService {

  constructor(private ser:HttpClient) { }

  up: Customerdata;
  public getCustomer(){
    console.log("ins service get employees");
    const headers=new HttpHeaders().set('Content_Type','text/plain ;charset=utf-8');
    return this.ser.get<Customerdata>("http://localhost:5000/customer/GetAllCustomers");
  }

  public addCustomer(addemp: Customerdata) {
    console.log("ins service add");
    console.log(addemp);
    const headers =new HttpHeaders().set('Content_Type', 'text/plain ;charset=utf-8');
    return this.ser.post("http://localhost:5000/customer/addCustomer", addemp,  { headers, responseType: 'text'});
  }

  public update(up: Customerdata) {
    this.up = up;
  }
  public updateMethod() {
    return this.up;
  }
  public onUpdate(updatemp: Customerdata) {
    console.log("ins service update");
    const headers =new HttpHeaders().set('Content_Type', 'text/plain ;charset=utf-8');
    return this.ser.put("http://localhost:5000/customer/UpdateCustomer", updatemp,  { headers, responseType: 'text'});
  }
  delete(id: number) {
    console.log("ins service delete");
    const headers =new HttpHeaders().set('Content_Type', 'text/plain ;charset=utf-8');
    return this.ser.delete("http://localhost:5000/customer/DeleteCustomer/" + id,  { headers, responseType: 'text'});
  }
  login(c:Customerdata){
    const headers =new HttpHeaders().set('Content_Type', 'text/plain ;charset=utf-8');
    return this.ser.put("http://localhost:5000/customer/Logincustomer", c,  { headers, responseType: 'text'});
  }

  logOut() {
    sessionStorage.removeItem('customername')
  }

}
export class Customerdata{
  userId:number;
  userName:string;
  userType:string;
  userPassword:string;
  userPhoneno:number;
  userEmail:string;
}