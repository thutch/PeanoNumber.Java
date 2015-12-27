package peanoNumber.JavaTests;

import org.junit.After;
import org.junit.Before;

public class ScenarioBase {
	
	@Before
	public void testInitialize(){
		given();
		becauseOf();
	}
	
	@After
	public void testCleanUp(){
		cleanUp();
	}
	
	protected void given(){
		
	}

	protected void becauseOf(){
		
	}
	
	protected void cleanUp(){
		
	}
}
