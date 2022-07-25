package com.bilgeadam.employee;

public class EmployeeController {

	public double calculateYearlySalary(EmployeeDetails employeeDetails) {

		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary() * 12;
		return yearlySalary;
	}

	public double calculateBonus(EmployeeDetails employeeDetails) {
		double bonus;
		if (employeeDetails.getMonthlySalary() < 10000) {
			bonus = 500;
		} else {
			bonus = 1000;
		}
		return bonus;
	}

}
