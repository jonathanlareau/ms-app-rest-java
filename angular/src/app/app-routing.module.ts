import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SayComponent } from './say/say.component';

const routes: Routes = [
  {path:'sayhello', component: SayComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
