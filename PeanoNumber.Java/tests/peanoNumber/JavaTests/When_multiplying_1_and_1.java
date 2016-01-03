package peanoNumber.JavaTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class When_multiplying_1_and_1 extends PeanoNumberMultiplicationScenario {
	@Test
	public void then_result_should_be_one(){
		assertEquals(1, numberOfPred(ClassUnderTest));
	}
}
