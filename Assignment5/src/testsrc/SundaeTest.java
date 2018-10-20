import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest {

	@Test
	void testGetCost() {
		assertEquals(5, new Sundae("Sundae Ice", 2,"Topping",3).getCost());
	}

}
