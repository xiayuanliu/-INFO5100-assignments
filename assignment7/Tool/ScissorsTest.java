package Tool;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScissorsTest {

	@Test
	void testFight() {
		 assertEquals(true, new Scissors(3).fight(new Paper(3)));
	}

}
