import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IceCreamTest {

	@Test
	void testGetCost() {
		assertEquals(12, new IceCream("icecream", 12).getCost());
	}

}
