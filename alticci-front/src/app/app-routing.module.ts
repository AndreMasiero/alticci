import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {SequentialNumberListComponent} from './process/list/sequential-number-list.component';


const routes: Routes = [
  {path: '', component: SequentialNumberListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
