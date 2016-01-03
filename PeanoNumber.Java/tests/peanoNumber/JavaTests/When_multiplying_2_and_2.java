package peanoNumber.JavaTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import peanoNumberJava.PeanoNumber;

public class When_multiplying_2_and_2 extends PeanoNumberMultiplicationScenario {
	protected void given() {
		num1 = PeanoNumber.fromInteger(2);
		num2 = PeanoNumber.fromInteger(2);
	}
	
	@Test
	public void then_result_should_be_4(){
		assertEquals(4, numberOfPred(ClassUnderTest));
	}
}
