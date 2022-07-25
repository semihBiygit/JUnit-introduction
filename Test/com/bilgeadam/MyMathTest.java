package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}

	@BeforeEach
	public void before() {
		System.out.println("Before");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}

	@AfterEach
	public void after() {
		System.out.println("After");
	}

	@Test
	void sum_with3numbers() {

		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] { 2, 4, 3 });
		assertEquals(9, result);
		System.out.println("Inside sum with 3 numbers test");

	}

	@Test
	void sum_with2numbers() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] { 2, 4 });
		assertEquals(6, result);
		System.out.println("Inside sum with 2 numbers test");
	}

}
