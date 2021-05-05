import { Component, OnInit } from '@angular/core';
import {
  MatSnackBar,
  MatSnackBarHorizontalPosition,
  MatSnackBarVerticalPosition,
} from '@angular/material/snack-bar';

@Component({
  selector: 'app-item-sold-btn',
  templateUrl: './item-sold-btn.component.html',
  styleUrls: ['./item-sold-btn.component.sass']
})
export class ItemSoldBtnComponent implements OnInit {

  constructor(
    private matSnackBar: MatSnackBar
  ) { }

  horizontalPosition: MatSnackBarHorizontalPosition = 'start';
  verticalPosition: MatSnackBarVerticalPosition = 'bottom';

  ngOnInit(): void {
  }

  openSnackBar(): void {
    this.matSnackBar.open('1 Item Sold', 'Dismiss', {
      duration: 2000,
      horizontalPosition: this.horizontalPosition,
      verticalPosition: this.verticalPosition
    });
  }
}