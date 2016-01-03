package peanoNumber.JavaTests;

import peanoNumberJava.PeanoNumber;

public class PeanoNumberMultiplicationScenario extends PeanoNumberScenario {

	PeanoNumber num1;
	PeanoNumber num2;

	public PeanoNumberMultiplicationScenario() {
		super();
	}

	protected void given() {
		num1 = PeanoNumber.fromInteger(1);
		num2 = PeanoNumber.fromInteger(1);
	}

	protected void becauseOf() {
		ClassUnderTest = num1.multiply(num2);
	}

}