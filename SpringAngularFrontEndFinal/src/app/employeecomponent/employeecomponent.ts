import { Component, OnInit } from '@angular/core';
import { Employeeservice } from '../employeeservice';
import { Employee } from '../employee';

@Component({
  selector: 'app-employeecomponent',
  standalone: false,
  templateUrl: './employeecomponent.html',
  styleUrl: './employeecomponent.css',
})
export class Employeecomponent implements OnInit {
  employees : Employee[] = [];
  constructor(private employeeService : Employeeservice){}
    ngOnInit(): void {
      this.employeeService.getEmployees().subscribe(
        response => { this.employees = response; }
      )
    }
}
