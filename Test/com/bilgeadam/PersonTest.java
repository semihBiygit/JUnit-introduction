package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bilgeadam.Person;

class PersonTest {

	Person person;

	@BeforeEach
	void setUp() throws Exception {
		person = new Person();
	}

	@Test
	void test() {
		person.setName("Semi");
		person.setAge(25);
		person.setSalary(25000);

		assertEquals("Semi", person.getName());

	}

}
