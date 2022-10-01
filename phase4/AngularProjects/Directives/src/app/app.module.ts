import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DirectiveComponent } from './directive/directive.component';
import { ChangeColorDirective } from './ChangeColorDirective';

import { HighLightDirective } from './HighLightDirective';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    DirectiveComponent,
    ChangeColorDirective,

HighLightDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,

FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
