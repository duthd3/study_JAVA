class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white", "auto", 4);
	}
	
	Car(Car c){
		color =c.color;
		gearType = c.gearType;
		door = c.door;
		//this(c.color, c.gearType, c.door) 가 더 좋은 코드이다.
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car(c1);
		System.out.println("c1의 color = " + c1.color+", gearType=" + c1.gearType +
				", door=" + c1.door);
		System.out.println("c2의 color = " + c2.color+", gearType=" + c2.gearType +
				", door=" + c2.door);
		
		c1.door = 100;
		System.out.println("c1.door= 100; 수행후");
		System.out.println("c1의 color = " + c1.color+", gearType=" + c1.gearType +
				", door=" + c1.door);
		System.out.println("c2의 color = " + c2.color+", gearType=" + c2.gearType +
				", door=" + c2.door);
	}

}
