import java.util.ArrayList;

class Container<T>{			//T je lahko karkoli
	
	T value;
	public void show() {
		System.out.println(value.getClass().getName());
	}
}


class Container2<T extends Number>{			//T je lahko samo class ki extenda Number class
	
	T value;
	public void show() {
		System.out.println(value.getClass().getName());
	}
	
	public void demo(ArrayList<? extends T> obj) {
		
	}
	
	public void demo2(ArrayList<? super T> obj) {	//sprejme samo super clasee 
		
	}
}


public class Demo {
	public static void main(String[] args) {
		
		
		Container<Integer> obj = new Container<>();	//ne dela z int
		obj.value=9;
		obj.show();
		
		Container2<Float> obj2 = new Container2<>();
	}

}
