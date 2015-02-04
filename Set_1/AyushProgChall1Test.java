import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class AyushProgChall1Test {

	AyushProgChall1 c;
	
	@Before
	public void setUp() throws Exception{
		c = new AyushProgChall1();
	}
	
	@Test
	public void testDelimiter() {
		assertTrue("Valid: ()[]{}", c.Delimiter("()[]{}"));
		assertTrue("Valid: ([{}])", c.Delimiter("([{}])"));
		assertTrue("Valid: ([]{})", c.Delimiter("([]{})"));
		
		assertFalse("Invalid: ([)]", c.Delimiter("([)]"));
		assertFalse("Invalid: ([]", c.Delimiter("([]"));
		assertFalse("Invalid: []))", c.Delimiter("[]))"));
	}

}
