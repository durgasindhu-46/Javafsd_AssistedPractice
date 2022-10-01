import { TempchangePipe } from './tempchange.pipe';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PipesComponent } from './pipes/pipes.component';
import { MyColor } from './MyColor';
import { HighLightMe } from './HightlightMe';

@NgModule({
  declarations: [
    AppComponent,
    PipesComponent,
    MyColor,
    HighLightMe,
    TempchangePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
