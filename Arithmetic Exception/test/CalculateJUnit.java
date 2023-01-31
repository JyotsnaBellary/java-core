import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculateJUnit {
	
	CalculateBO calculateBO;
	@Before
	public void createBoInstance() {
		//fill the code
		calculateBO = new CalculateBO();
	}
	
	@Test
	public void testCalculateCost() {
		//fill the code
		assertEquals(10.0, calculateBO.calculateCost(30, 3), 10.0);
	}
	
	@Test(expected = ArithmeticException.class)

    public void testCalculateCostException() {

        //fill the code

        assertEquals(30.0, calculateBO.calculateCost(30, 0), 30.0);

    }
}
