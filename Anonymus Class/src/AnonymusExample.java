class A {
	
	public void show() {
		System.out.println("in a show");
	}
}


public class AnonymusExample {

	public static void main (String[] args) {
		
		A obj1 = new A() {
			public void show() {
				
				System.out.println("im the best");
			}
		};
		
		obj1.show();
	}
}
