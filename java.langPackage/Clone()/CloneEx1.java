class Point implements Cloneable{
	int x, y;
	Point(int x, int y){
		this.x =x;
		this.y =y;
	}
	
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	public Point clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return (Point)obj;
	}
}
public class CloneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point original = new Point(3, 5);
		Point copy = original.clone(); //복제(clone)해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);
	}

}
