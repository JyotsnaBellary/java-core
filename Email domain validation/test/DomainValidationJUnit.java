import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class DomainValidationJUnit {
	//fill the code
	DomainValidationBO domainValidationBO;
	
	@Before
	public void createBoInstance() {
		//fill the code
		domainValidationBO = new DomainValidationBO();
	}
	@Test
	public void testValidDomain() {
		//fill the code
		assertEquals("Valid email address", domainValidationBO.validateMailDomain("jyotsna@in.org"));
	}
	@Test
	public void testInvalidDomain() {
		//fill the code
		assertEquals("Invalid email address", domainValidationBO.validateMailDomain("jyotsna@in"));
	}
}
