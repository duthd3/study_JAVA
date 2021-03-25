
public class PointTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p3 = new Point3D();
		Point p2 = new Point();
		System.out.println("p2.x="+ p2.x);
		System.out.println("p2.y="+ p2.y);
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
		
	}
	

}

class Point{
	int x = 10;
	int y = 120;
	Point(){}
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
		
	}
}

class Point3D extends Point{
	int z = 30;
	Point3D() {
		this(100,200,300);
	}
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
}
