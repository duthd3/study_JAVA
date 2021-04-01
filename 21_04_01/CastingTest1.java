
public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = new FireEngine();
		
		fe.water();
		car = fe; //자손 타입을 조상 타입으로 형변환. 생략가능(업캐스팅)
//		car.water;//에러 car타입의 참조변수로는 water사용불가.
		fe2 = (FireEngine)car; //조상타입을 자손타입으로 형변환. 생략불가(다운캐스팅)
		fe2.water();
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
	
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
	
}
