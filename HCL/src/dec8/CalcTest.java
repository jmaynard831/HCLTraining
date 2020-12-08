package dec8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {

	@BeforeEach
	void testBeforeEach() {
		System.out.println("Before");
	}
	@AfterEach
	void testAfterEach() {
		System.out.println("After");
	}
	@Test
	void testAdd() {
		assertEquals(20, new Calc().add(10, 10));
	}
	@Test
	void testMult() {
		assertEquals(20, new Calc().mult(10, 2));
	}

}
