package method_Calling;

public class NonSataticMethodCall_SameClass {
	
	public static void main(String args[])
	{
		NonSataticMethodCall_SameClass ns=new NonSataticMethodCall_SameClass();
		ns.sample();
		
	}

	public void sample()
	{
		System.out.println("Non-static method sample is running");
	}
}
