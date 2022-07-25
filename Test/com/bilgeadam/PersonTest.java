package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

	Person person;

	@BeforeEach
	void setUp() throws Exception {
		person = new Person();
	}

	@Test
	void test() {
		person.setName("Tugce");
		person.setAge(25);
		person.setSalary(25000);

		assertEquals("Tugce", person.getName());

	}

}
