import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {BookingEditComponent} from "./booking-edit/booking-edit.component";

const routes: Routes = [
  {path: "booking/edit", component: BookingEditComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BookingsRoutingModule { }
