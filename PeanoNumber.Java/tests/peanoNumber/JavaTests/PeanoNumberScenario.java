package peanoNumber.JavaTests;

import peanoNumberJava.PeanoNumber;

public class PeanoNumberScenario extends ScenarioBase {
	
	protected PeanoNumber ClassUnderTest;
	protected int integer;
	
	protected void becauseOf(){
		ClassUnderTest = PeanoNumber.fromInteger(integer);
	}
	
	protected void cleanUp(){
		ClassUnderTest = null;
	}
	
	protected int numberOfPred(PeanoNumber target){
		int count = 0;
		PeanoNumber pred = target.getPred();
		while(pred != null){
			count ++;
			pred = pred.getPred();
		}
		
		return count;
	}
	
}
