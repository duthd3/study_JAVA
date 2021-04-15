
public class CastingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Car car2= null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; //car참조변수가 참조하는 인스턴스가 Car이기 때문에 오류발생. 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용되지 않는다.
		fe.drive();
		car2 = fe;
		car2.drive();

	}

}
