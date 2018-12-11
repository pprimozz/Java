package com.lambda;

import java.util.Comparator;

public class Main {

	  public static void main(String [] args) {
	
		  Comparator<String> stringComparatorLambda =
				  (String s1, String s2) -> {return s1.compareTo(s2);};
	 int compare = stringComparatorLambda.compare("hello", "world");
	 System.out.println(compare);
	  
	  }
}
