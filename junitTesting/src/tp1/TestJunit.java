package tp1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

	String message = "Hello word";
	MessageUtil mu = new MessageUtil(message);
	
	
	@Test
	public void testAdd(){
		String str = "Junit is working fine !!";
		assertEquals("Junit is working fine !!", str);
	}
	
	@Test
	public void testPrintMessage(){
		String msg= "";
		assertEquals(msg, mu.printMessage());
	}
	
	
	
}
