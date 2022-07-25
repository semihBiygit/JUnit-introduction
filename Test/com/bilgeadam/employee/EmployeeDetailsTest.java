package com.bilgeadam.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeDetailsTest {
	EmployeeController employeeController = new EmployeeController();
	EmployeeDetails employee = new EmployeeDetails();

	@Test
	void calculateBonusTest() {
		employee.setName("Semih");
		employee.setAge(25);
		employee.setMonthlySalary(15000);

		employeeController.calculateBonus(employee);

		assertEquals(1000, employeeController.calculateBonus(employee));
		assertEquals("Semih", employee.getName());

	}

	@Test
	void calculateYearlySalaryTest() {
		employee.setName("Semih");
		employee.setAge(25);
		employee.setMonthlySalary(15000);
		
		assertEquals(180000, employeeController.calculateYearlySalary(employee));
	}

}
