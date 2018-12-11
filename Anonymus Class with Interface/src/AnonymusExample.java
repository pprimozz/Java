interface Abc{
	void show();
}


public class AnonymusExample {

	public static void main (String[] args) {
		
		Abc obj = () -> {
				System.out.println("I'm the best");
			};
		
		obj.show();
	}
}
