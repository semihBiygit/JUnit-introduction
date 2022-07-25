package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaxTest {

	@Test
	void findMaxTest() {
		assertEquals(4, FindMax.findMax(new int[] { 1, 2, 4, 3 }));
		assertEquals(-1, FindMax.findMax(new int[] { -1, -2, -4, -3 }));

	}

}
