package peanoNumber.JavaTests;

import org.junit.After;
import org.junit.Before;

/**
 * 
 * Java port of a C# BDD Scenario base class
 *http://blogs.msdn.com/b/elee/archive/2009/01/20/bdd-with-mstest.aspx
 */
///
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
