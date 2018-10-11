package jak.faz;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	Bird br = new Bird();
	// Positive Scenarios
	@Test
	public void testWalk() {
		String result = br.walk();
		assertEquals(result,"true");
	}
	
	@Test
	public void testFly() {
		String result = br.fly();
		assertEquals(result,"true");
	}
	

	@Test
	public void testSing() {
		String result = br.sing("Quack");
		assertEquals(result,"true");
	}
	


}
