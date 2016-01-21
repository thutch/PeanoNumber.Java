package peanoNumberJava;

public abstract class PeanoNumber {
	
	private PeanoNumber pred;
	
	public static PeanoNumber fromInteger(int number){
		if(number == 0){
			return new Zero();
		} else {
			PeanoNumber pNum = fromInteger(number - 1);
			return of(pNum);
		}
	}
	
	public static PeanoNumber of(PeanoNumber pNum){
		return new Succ(pNum);
	}
	
	protected void setPred(PeanoNumber aPred){
		pred = aPred;
	}
	
	public PeanoNumber getPred(){
		return pred;
	}
	
	public PeanoNumber getSucc(){
		return of(this);
	}
	
	public PeanoNumber add(PeanoNumber aPeanoNumber){
		PeanoNumber subtotal = this.getPred().add(aPeanoNumber);
		return subtotal.getSucc();
	}
	
	public PeanoNumber subtractPeanoNumber(PeanoNumber aPeanoNumber){
		PeanoNumber result = getSucc().subtractPeanoNumber(aPeanoNumber);
		return result.getPred();
	}
	
	public PeanoNumber multiply(PeanoNumber aPeanoNumber){
		
		PeanoNumber subtotal = aPeanoNumber;
		PeanoNumber pred = getPred();
		while(pred.isZero() == false){
			subtotal = subtotal.add(aPeanoNumber);
			pred = pred.getPred();
		};
		
		return subtotal;
	}
	
	public boolean isZero(){
		return false;
	}
	
	public boolean isSucc(){
		return false;
	}
	
	public abstract void print();

}
