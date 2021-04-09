class Point{
	int x;
	int y;
	
	Point(){}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	//Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:" + x+", y: "+y;
	}
}

class Point3D extends Point{
	int z;
	
	//조상의 getLocation()을 오버라이딩
	String getLocation() {
		return "x:" + x+", y: "+y + ",z: " +  z;
	}
}
public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(3,5);
//		p.x=3;
//		p.y=5;
		
		System.out.println(p);
	}

}
