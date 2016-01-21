package peanoNumber.JavaTests;

import static org.junit.Assert.*;

import org.junit.Test;

import peanoNumberJava.PeanoNumber;

public class When_adding_one_to_a_peano_number extends PeanoNumberScenario {

	PeanoNumber addend;
	PeanoNumber result;
	
	protected void given(){
		ClassUnderTest = PeanoNumber.fromInteger(1);
		addend = PeanoNumber.fromInteger(1);
	}
	
	protected void becauseOf(){
		result = ClassUnderTest.add(addend);
	}
	
	@Test
	public void then_first_pred_should_be_Succ(){
		PeanoNumber firstPred = result.getPred();
		assertTrue(firstPred.isSucc());
	}
	
	@Test
	public void then_second_pred_should_be_Zero(){
		PeanoNumber secondPred = result.getPred().getPred();
		assertTrue(secondPred.isZero());
	}
	
	@Test
	public void then_there_should_be_a_pred(){
		assertEquals(1, numberOfPred(ClassUnderTest));
	}
	
}
