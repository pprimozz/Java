
public class Demo {
	public static void main(String[] args) {
		
		Integer[] iray = {1,2,3,4,5};
		Character[] cray = {'b','c','d','t','h'};
		
		printMe(iray);
		printMe(cray);
	}
	
	public static <T> void printMe(T[] x) {
		for (T b : x) System.out.printf("%s ", b);
	}
}
