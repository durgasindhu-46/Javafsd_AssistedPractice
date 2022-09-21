import { Component, EventEmitter, Input, OnInit,Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-greeting',
  templateUrl: './greeting.component.html',
  styleUrls: ['./greeting.component.css']
})
export class GreetingComponent implements OnInit {
//to disable a BUTTON
isDisabled= false;
  constructor() { }
//to start
  ngOnInit(): void {
  }
  //void function to display alert hello all sindu
  name:string="sindhu";
  greet():void{
    alert("hello all"+this.name);
  }
  //login form
username:string="";
password:string="";
msg="";
status:string='error';
cssStringVar:string='';
validate(){
  if(this.username=="sin" && this.password=="123"){
    this.status='';
    this.msg="welcome"+this.username;
  }
  else{
    this.msg="Invalid user";
    this.status='error';
    this.cssStringVar='red size20';
  }
  this.username="";
  this.password="";
}
//parent to child calling
@Input()  productList: Array<any>=[];

//child to parent calling
//Count change on @Output
public clickCount:number=0;
@Output() onChanged=new EventEmitter<number>();
//to increase step count on clicking a button 
//event binding
countChange(count : number){
  count++;
  this.clickCount=count;
  this.onChanged.emit(this.clickCount);
}
}
