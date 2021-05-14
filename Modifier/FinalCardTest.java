class Card{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){
		this.KIND = kind;
		this.NUMBER = num;
	}
	
	Card(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card("HEART", 10);
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);

	}

}
