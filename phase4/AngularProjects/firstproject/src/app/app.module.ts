import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GreetingComponent } from './greeting/greeting.component';
import { FormsModule } from '@angular/forms';
import { TemplateformComponent } from './templateform/templateform.component';
import { ValidtemplateformComponent } from './validtemplateform/validtemplateform.component';
import { ReactiveFormsModule } from '@angular/forms'; 
import { NgForm } from '@angular/forms';
import { ReactiveformexampleComponent } from './reactiveformexample/reactiveformexample.component';
@NgModule({
  declarations: [
    AppComponent,
    GreetingComponent,
    TemplateformComponent,
    ValidtemplateformComponent,
    ReactiveformexampleComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
