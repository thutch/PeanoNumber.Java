package peanoNumber.JavaTests;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import peanoNumberJava.PeanoNumber;

public class When_subtracting_one_from_one extends PeanoNumberScenario {

	PeanoNumber addend;
	PeanoNumber result;
	
	protected void given(){
		ClassUnderTest = PeanoNumber.fromInteger(1);
		addend = PeanoNumber.fromInteger(1);
	}
	
	protected void becauseOf(){
		result = ClassUnderTest.subtractPeanoNumber(addend);
	}
	
	@Ignore
	@Test
	public void then_result_should_be_Zero() {
		assertTrue(result.isZero());
	}

}
