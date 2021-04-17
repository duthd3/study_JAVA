class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		return "kind: " + this.kind + ", number :" + this.number;
	}
}
public class CardToString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
