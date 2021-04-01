class Product{
	int price; //제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //보너스점수는 제품가격의 10%
				
	}
}

class Tv extends Product{
	Tv(){
		//조상클래스의 생성자 Product(int price)를 호출		
		super(100); //Tv의 가격을 100만원으로 한다.
	}
	public String toString() {return"Tv";}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {return"Computer";}
}

class Buyer{//고객
	int money=1000; //고객이 가진돈
	int bonusPoint=0; //보너스점수
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		System.out.println(p + "를 구입하셨습니다.");
	}
}


public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Tv t = new Tv();		
		Computer c = new Computer();
		
		b.buy(t);
		b.buy(c);
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");

	}

}
