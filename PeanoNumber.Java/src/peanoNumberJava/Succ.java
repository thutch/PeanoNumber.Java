package peanoNumberJava;

public class Succ extends PeanoNumber {
	
	protected Succ(PeanoNumber pred){
		setPred(pred);
	}
	
	public boolean isSucc(){
		return true;
	}
	
	public void print()
	{
		System.out.print("succ(");
		this.getPred().print();
		System.out.println(")");
	}

}
