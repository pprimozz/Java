
public class Test {
	
	int normalVariable=1;
	static int staticVariable=5;
	
	
	public void normalMethod(){
		
		System.out.println(""+normalVariable);
		System.out.println(""+staticVariable);
		//staticMethod();
	}
	
	
	public static void staticMethod(){
	
		Test t = new Test();
	
		//System.out.println(""+normalVariable);
		System.out.println(""+staticVariable);
		t.normalMethod();
	}
	
	// Method should be static when it doesn't have any interactions with 
	// normal methods and variables in the same class
	
	

}
