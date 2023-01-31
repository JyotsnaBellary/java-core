import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OddEvenJUnit {
	OddEvenBO oddevenBO;
	
	@Before
	public void createBoInstance() {
		//fill the code
		oddevenBO = new OddEvenBO();
	}
	
	@Test
	public void testOddNumber() {
		//fill the code
		assertEquals("Odd", oddevenBO.findOddEven(3));
	}
	
	@Test
	public void testEvenNumber() {
		//fill the code
		assertEquals("Even", oddevenBO.findOddEven(2));
	}
}
