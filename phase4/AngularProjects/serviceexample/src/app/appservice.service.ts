import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppserviceService{

  constructor() { }
  getApp():string{
    return "hello world";
  }
  getProduct():Array<any>{
    return [{name:"rice",price:200},{name:"sugar",price:40}]}
}
