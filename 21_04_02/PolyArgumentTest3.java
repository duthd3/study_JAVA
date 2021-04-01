import java.util.*;

class Product{
	int price; //제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //보너스점수는 제품가격의 10%
				
	}
	Product(){} //기본 생성자
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
class Audio extends Product{
	Audio(){
		super(50);
	}
	public String toString() {return"Audio";}	
	
}

class Buyer{//고객
	int money=1000; //고객이 가진돈
	int bonusPoint=0; //보너스점수	
	Vector item = new Vector();
	int i;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item.add(p); //제품을 product[] item에 저장한다.
		System.out.println(p + "를 구입하셨습니다.");
	}
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint-= p.bonusPoint;
			System.out.println(p + "를 반품하셨습니다.");
		}
		else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	void summary() {
		int sum = 0; //구매한 물품에 대한 정보를 요약해서 보여 준다.
		String itemList="";
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		
			if(item.isEmpty()) {
				System.out.println("구입하신 제품이 없습니다.");
				
			}
			for(int i =0; i<item.size(); i++) {
				Product p =(Product)item.get(i);
				sum+= p.price;
				itemList += (i==0) ? "" + p : ", " +p;
			
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}


public class PolyArgumentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();

	}

}
