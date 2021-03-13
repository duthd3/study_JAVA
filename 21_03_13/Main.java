public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MathodEx mex = new MathodEx();
//		int[] a = {1,2,3,4,5};
//		
//		System.out.println(mex.add(3, 3));
//		System.out.println(mex.add(3L, 3));
//		System.out.println(mex.add(3L, 3L));
//		System.out.println(mex.add(3, 3L));
//		System.out.println(mex.add(a));
		
//		Data d =new Data();
//		DData dd = new DData();
//		DData ddd = new DData(28);
//		
//		System.out.println("d.x =" + d.x);
//		System.out.println("dd.x =" + dd.x);
//		System.out.println("ddd.x =" + ddd.x);
/*		Car car1 = new Car("빨강", "manual", 2);
		Car car2 = new Car("하양", "auto", 4);
		System.out.println("car1의 color=" + car1.color +", gearType="
									+car1.gearType +", door=" + car1.door);
		System.out.println("car2의 color=" + car2.color +", gearType="
									+car2.gearType +", door=" + car2.door);
		car1.disp();
		car1.setColor("시뻘건");
		car1.disp();
		car2.disp();*/
		
	//	InitEx iex = new InitEx();
	//	System.out.println();
	//	InitEx iexx = new InitEx(); 
//		System.out.println(iex.instanceVal);
//		System.out.println(iex.staticVal);
		
/*		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		Product[] pArr = {p1, p2, p3};
		Product.disp(pArr);
		*/
		
/*		chelsu c = new chelsu();
		KangSa ks = new KangSa();
		Younghee yh = new Younghee();
		
		yh.setName();
		c.setName(); //name이란 속성을 가지고 있지 않지만 상속으로 인해 사용가능
		ks.setName(); //"
		
		System.out.println(c.name);
		c.sleeping();
		
		System.out.println(ks.name);
		ks.teaching();
		
		System.out.println(yh.name);
		yh.sleeping();
		*/
		//Parent p = new Parent(); //객체가 완성되지 않음.
		
//		Child c = new Child();
//		c.method();
//		c.method1();
//		CAbsEx cabs = new CAbsEx();
//		cabs.setArea();
//		System.out.println("Area: " + cabs.getArea());
		
		CInterfaceEx ci = new CInterfaceEx();
		ci.setArea();
		System.out.println("Area: " + ci.getArea());
	}

}

interface InterfaceEx{ //인터페이스 구현
	public static final int width = 10;
	public static final int height = 20;
	
	
	public abstract void setArea();
	public abstract int getArea(); 
		
	
}

class CInterfaceEx implements InterfaceEx{
	int area;
	public void setArea() {
		area = width * height;
	}
	public int getArea() {
		return this.area;
	}
		
		
		
		
	}


abstract class AbsEx{
	int width;
	int height;
	int area;
	
	abstract void setArea();
	int getArea() {
		return this.area;
	}
}

class CAbsEx extends AbsEx{
	void setArea() {
		width = 10;
		height = 20;
		area = width*height;
	}
}

//final class Parent //final이 클래스에 붙으면 상속불가,재사용불가
abstract class Parent{  
	int x = 10;
	
	//개념적으로만 존재 실제 구현은 child에서!
	
	abstract void method(); //개념적으로만 존재 실제 구현은 child에서!
		
	final void method1() {
		System.out.println("김씨");
	}
	
}
class Child extends Parent{
	int x = 20;
	void method() {
		int x = 30;
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x); //부모의 x
	}
	
}
class Human{ //부모 클래스
	String name;
	
	void setName() {
		name = "Human";
	}
	void sleeping() {
		System.out.println("I am Sleeping now");
	}
	void eating() {
		System.out.println("I am eating now");
	}
}

class chelsu extends Human{	//자식 클래스
	void setName() {
		name = "chelsu";
	}

	void studing() {
		System.out.println("I am studing now");
	}
}

class KangSa extends Human{	//자식 클래스
	void setName() {
		name = "KimKangSa";
	}

	void teaching() {
		System.out.println("I am teaching now");
	}
}

class Younghee extends Human{
	void setName() {
		name = "Younghee";
	}

}
	
class Product{
	 int count = 10000;
	static int i = 0;
	 {
		i++;
		count = 10000+i;
	}
	Product(){
		
	}
	public  int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public static int getI() {
		return i;
	}
	public static void setI(int i) {
		Product.i = i;
	}
	
	public static void disp(Product[] pArr) {
		for(int i=0; i<pArr.length; i++)
		{
			System.out.println("[Product" + (i+1) + "]의 제품번호:" + pArr[i].getCount());
		}
		System.out.println("총 제품수: "+Product.getI());
	}
	

}

class InitEx{
	int instanceVal=1; //인스턴스 생성할 때 마다 실행
	static int staticVal=1; //한번만 실행
	
	static{
		staticVal = 100000;
		System.out.println("static{}.staticVal=" + staticVal);
		}
	
	{
		instanceVal++;
		staticVal++;
	System.out.println("Instance{}.instanceVal = " + instanceVal);
	System.out.println("Instance{}.staticVal = " + staticVal);

	}
	InitEx(){
		this.instanceVal++;
		staticVal++;
		System.out.println("InitEx().instanceVal=" + instanceVal);
		System.out.println("InitEx().staticVal=" + staticVal);
	}
	
		
	
}

class InitTest{
	int x; //0으로 초기화
	int y = x;
	
	void method() {
		int i = 0;
		int j = i;
	}
}
class Car{
	String color;
	String gearType;
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
	public void disp() {
		System.out.println("color : " + getColor());
		System.out.println("gearType : " + getGearType());
		System.out.println("door : " + getDoor());
		
	}

	int door;
	
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}
class DData{
	int x;
	
	DData(){
		x = 100;
	}
	
	DData(int xx){
		x= xx;
	}
}
class Data{
	int x;
	
	Data(){  //기본 생성자
		
	}
}

class MathodEx{
	int add(int a, int b) {
		System.out.println("add(int , int)");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.println("add(long , int)");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.println("add(long , long)");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.println("add(int , long)");
		return a+b;
	}
	
	int add(int[] a) {
		System.out.println("add(int[])");
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result+= a[i];
		}
		
		return result;
	}
}


