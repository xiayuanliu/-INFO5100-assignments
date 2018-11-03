package Tool;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaperTest {

	@Test
	void testFight() {
		assertEquals(true, new Paper(3).fight(new Rock(3)));
	}

}
