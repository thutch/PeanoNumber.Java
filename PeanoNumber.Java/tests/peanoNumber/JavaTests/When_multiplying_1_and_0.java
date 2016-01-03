package peanoNumber.JavaTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import peanoNumberJava.PeanoNumber;

public class When_multiplying_1_and_0 extends PeanoNumberMultiplicationScenario {
	protected void given() {
		num1 = PeanoNumber.fromInteger(1);
		num2 = PeanoNumber.fromInteger(0);
	}
	
	@Test
	public void then_result_should_be_0(){
		assertEquals(0, numberOfPred(ClassUnderTest));
	}
}
