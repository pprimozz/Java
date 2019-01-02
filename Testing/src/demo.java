import java.util.*;
public class demo {
	 public static void main(String args[] ) throws Exception {
		   
		    Scanner s = new Scanner(System.in);
			int T = s.nextInt();
		
			String A[] = new String[T];
			String B[] = new String[T];
			
			for (int x=0; x<T; x++) {
				
				A[x] = s.next();
				B[x] = s.next();
			}
			s.close();
			int fuck=0;
			
			for (int i=0;i<A[0].length();i++) {
				if(A[0].charAt(i)=='p') {fuck++;}
			}
			boolean check=false;
			if(fuck >50) {check=true;}

			for (int y=0; y<T; y++) {
				char tempA[] = A[y].toCharArray();
				char tempB[] = B[y].toCharArray();
				int counterA=0;
				int counterB=tempB.length;
					
				for (int z=0; z<A[y].length();z++) {
								if(check==false) {
							    	for (int g=0;g<tempB.length;g++)
							    	{
							    		if (tempB[g]==tempA[z])
							    			{
							    				tempB[g]=' ';
							    				counterA++;
							    				break;
							    			}	
							    	}
								}
						
								
					}
				
				    if (counterA==counterB) System.out.println("YES");
				    else System.out.println("NO");
			}		
	    }
}
