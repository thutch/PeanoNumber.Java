package peanoNumberJava;

public class Zero extends PeanoNumber {

	public PeanoNumber add(PeanoNumber aPeanoNumber)
	{
		return aPeanoNumber;
	}
	
	public PeanoNumber subtractPeanoNumber(PeanoNumber aPeanoNumber){
		return aPeanoNumber;
	}
	
	public PeanoNumber multiply(PeanoNumber aPeanoNumber){
		return this;
	}
	
	public boolean isZero(){
		return true;
	}
	
	public void print()
	{
		System.out.print("zero");
	}
	
}
