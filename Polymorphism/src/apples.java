public class apples {
	public static void main(String[] args){
		
		food bucky[] = new food[3];
		bucky[0] = new potpie();
		bucky[1] = new tuna();
		bucky[2] = new food();
		
		for(int x=0;x<=2;x++){
			bucky[x].eat();	
		}
		
	}
	
}