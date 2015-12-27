package peanoNumber.JavaTests;
import static org.junit.Assert.*;

import org.junit.Test;

public class When_PeanoNumber_Is_Created_With_One extends PeanoNumberScenario {
	protected void given(){
		integer = 1;
	}
	
	@Test
	public void then_classUnderTest_should_be_Succ(){
		assertTrue(ClassUnderTest.isSucc());
	}
	
	@Test
	public void then_classUnderTest_should_have_one_pred(){
		assertEquals(1, numberOfPred(ClassUnderTest));
	}
}
