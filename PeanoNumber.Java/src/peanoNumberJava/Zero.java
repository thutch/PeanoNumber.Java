package peanoNumberJava;

public class Zero extends PeanoNumber {

	public PeanoNumber addPeanoNumber(PeanoNumber aPeanoNumber)
	{
		return aPeanoNumber;
	}
	
	public boolean isZero(){
		return true;
	}
	
	public void print()
	{
		System.out.print("zero");
	}
	
}
