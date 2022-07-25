package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivideExTest {

	DivideEx divideEx;

	@BeforeEach
	void setUp() {
		divideEx = new DivideEx();
	}

	@Test
	void divideTest() {
		assertEquals(5, divideEx.divide(10, 2));
	}

	@Test
	void divideZeroToANumber() {
		assertEquals(0, divideEx.divide(0, 11));

	}

	@Test
	void divideANumberToZero() {
		assertThrows(ArithmeticException.class, () -> divideEx.divide(121, 0));
	}

}
