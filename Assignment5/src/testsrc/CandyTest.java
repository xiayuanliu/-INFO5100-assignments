import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {

	@Test
	void testGetCost() {
		assertEquals(6, new Candy("Candy", 2, 3).getCost());
	}

	@Test
	void testGetWeight() {
		assertEquals(String.format("%.2f", 2.5), new Candy("Candy", 2.5, 3).getWeight());
	}

	@Test
	void testGetPricePerPound() {
		assertEquals(3, new Candy("Candy", 2, 3).getPricePerPound());
	}

}
