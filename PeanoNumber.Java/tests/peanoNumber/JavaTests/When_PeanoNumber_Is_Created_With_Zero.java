package peanoNumber.JavaTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class When_PeanoNumber_Is_Created_With_Zero extends PeanoNumberScenario {

	protected void given(){
		integer = 0;
	}
	
	@Test
	public void then_Zero_Should_Be_Created() {
		assertTrue(ClassUnderTest.isZero());
	}
	
	@Test
	public void then_ClassUnderTest_should_have_zero_preds(){
		assertEquals(0, numberOfPred(ClassUnderTest));
	}

}
