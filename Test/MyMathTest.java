import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bilgeadam.MyMath;

class MyMathTest {

	@BeforeEach
	 public void before() {
		 System.out.println("Before");
	 }
	
	@AfterEach
	public void after() {
		System.out.println("After");
	}
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
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
		int result = myMath.sum(new int [] {2,4});
		assertEquals(6, result);
		System.out.println("Inside sum with 2 numbers test");
	}

}
