import { Component } from '@angular/core';
import { AppserviceService } from './appservice.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[AppserviceService]
})
export class AppComponent {
  title = 'serviceexample';
  value:string="";
  productList:Array<any>=[];
  constructor(private _appService:AppserviceService){}
  ngOnInit():void{
    this.value=this._appService.getApp();
    this.productList=this._appService.getProduct();
  }

}
