package peanoNumber.JavaTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import peanoNumberJava.PeanoNumber;

public class When_multiplying_1_and_2 extends PeanoNumberMultiplicationScenario {
	protected void given() {
		num1 = PeanoNumber.fromInteger(1);
		num2 = PeanoNumber.fromInteger(2);
	}
	
	@Test
	public void then_result_should_be_2(){
		assertEquals(2, numberOfPred(ClassUnderTest));
	}
	
}
