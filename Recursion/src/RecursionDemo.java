
public class RecursionDemo {

	public static void main(String[] args) {
		
		System.out.println("FACTORIAL "+ getFactorial(6));
		
	}
	
	public static int getFactorial(int number) {
		
		System.out.println("Method "+number);
		
		if (number == 1) {
			
			System.out.println("Returned 1");
			return 1;
		} else {
			int result = number * getFactorial(number - 1);
				System.out.println("Returned "+result);
				System.out.println(" : "+number + " * getFACT("+number+" -1)");
				
				return result;
			}
		}
	}

