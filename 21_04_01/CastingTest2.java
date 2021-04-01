
public class CastingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; //에러!!자손타입의 참조변수로 조상타입의 인스턴스를 참조 할 수 없다.
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}
