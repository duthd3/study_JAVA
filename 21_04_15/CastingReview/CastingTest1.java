
public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water(); Car타입의 참조변수로는 water()를 호출할 수 없다.  
		fe2 = (FireEngine)car;
		fe2.water();

	}

}

class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("drive, Brrrr~");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
	
}

