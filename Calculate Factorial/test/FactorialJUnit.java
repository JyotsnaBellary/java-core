import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialJUnit {
	//Fill the code
	
	FactorialBO factorialBO;
	@Before
	public void createBoInstance() {
		//Fill the code
		factorialBO = new FactorialBO();
	}
	
	@Test
	public void testFactorial() {
		//Fill the code
		assertEquals(6, factorialBO.calculateFactorial(3));
	}
	
}
