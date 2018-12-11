
public class tuna {
	
	private String firstN;
	private String lastN;
	private static int members = 0;
	
	public tuna(String fn, String ln){
		firstN = fn;
		lastN = ln;
		members++;
		
		System.out.printf("Constructor for %s %s, members in the club: %d\n ", firstN,lastN,members);
		
	}

}
