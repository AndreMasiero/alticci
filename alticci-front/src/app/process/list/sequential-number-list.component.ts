import {Component, Injector, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {SequentialNumberService} from '../_service/sequential-number.service';
import {SequentialDto} from '../_model/sequential-dto';

@Component({
  selector: 'app-process-list',
  templateUrl: './sequential-number-list.component.html',
  styleUrls: ['./sequential-number-list.component.css']
})
export class SequentialNumberListComponent implements OnInit {

  displayedColumns: string[] = ['index', 'sum'];
  sequentialDto: Array<SequentialDto>;
  number = 20;
  calculating = false;

  constructor(private sequentialNumberService: SequentialNumberService) {
  }

  ngOnInit(): void {
    this.sequentialDto = new Array<SequentialDto>();

    this.getListSequentialNumbers(this.number);
  }

  getListSequentialNumbers(n: number) {
    this.calculating = true;
    this.sequentialNumberService.calculate(n).subscribe((result) => {
      this.sequentialDto = result;
      this.calculating = false;

    }, () => {
      this.calculating = false;
    });
  }

  calculate() {
    this.getListSequentialNumbers(this.number);
  }
}
