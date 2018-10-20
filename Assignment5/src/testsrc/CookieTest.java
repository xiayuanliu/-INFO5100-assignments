import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	@Test
	void testGetCost() {
		assertEquals(3, new Cookie("Cookie", 12, 3).getCost());
	}

	@Test
	void testGetNumber() {
		assertEquals(12, new Cookie("Cookie", 12, 3).getNumber());
	}

	@Test
	void testGetPricePerDozen() {
		assertEquals(3, new Cookie("Cookie", 12, 3).getPricePerDozen());
	}

}
