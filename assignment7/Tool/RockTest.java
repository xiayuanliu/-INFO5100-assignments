package Tool;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockTest {

	@Test
	void testFight() {
	    assertEquals(true, new Rock(3).fight(new Scissors(3)));
	
	}

}
