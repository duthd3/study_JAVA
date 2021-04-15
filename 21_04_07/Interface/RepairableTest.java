public class RepairableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine); //marine은 Repairable인터페이스를 구현하지 않았으므로! repair불가
		

	}

}

interface Repairable{}

class Unit{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
		
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);//Unit의 생성자 호출
		
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{ //Tank클래스가 Repairable인터페이스 구현
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship";
	}
}
