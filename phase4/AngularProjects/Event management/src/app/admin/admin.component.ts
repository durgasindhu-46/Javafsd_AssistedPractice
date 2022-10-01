import { Component, OnInit } from '@angular/core';
import { CrudHttpService } from '../curd-http.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  title = 'EventManagementApp';

  todoList:any = [];


  constructor(private crudHttpService: CrudHttpService,private router:Router){}

  
  ngOnInit(): void {
    this.listTodos();
  }

  listTodos(){
    this.crudHttpService.list().subscribe((response)=>{
      this.todoList = response;
    },(error=>{

    }));
  }

  createTodo(){
    let todo = {
      id: new Date().getTime(),
      firstname:`durga ` ,
      lastname:'sindhu',
      email:`durga546@gmail.com`,
    }
    this.crudHttpService.create(todo).subscribe((response)=>{
      this.listTodos();
    },(error=>{

    }));
  }

  user = {
    id: '',
    firstname:'',
    lastname:'',
    email: '',
  };
  isBookAdded = true;
  flag=false;
  show(){
    this.flag=!this.flag;
  }

  update(user:any){
    let data = {
      id:this.user.id,
      firstname:this.user.firstname ,
      lastname:this.user.lastname,
      email:this.user.email,
    }
     
    this.crudHttpService.update(user.id,data).subscribe((response)=>{
      this.listTodos();
    },(error=>{
    }));
  }


  //modify record
  edit(todo:any){
    this.flag=true;
    this.user.id= todo.id;
    this.user.firstname = todo.firstname;
    this.user.lastname = todo.lastname;
    this.user.email = todo.email;

  }
  
  editTodo(todo: any){
    let data={
      firstname:this.user.firstname,
      lastname:this.user.lastname,
      email:this.user.email,
    }
    this.crudHttpService.update(this.user.id,data).subscribe((response)=>{
      this.listTodos();
      this.flag =false;
    },(error=>{

    }));
  }

  deleteTodo(id: any){
    this.crudHttpService.delete(id).subscribe((response)=>{
      this.listTodos();
     
    },(error=>{
    }));
  }

}