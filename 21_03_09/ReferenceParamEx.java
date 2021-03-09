class Data2 {int x;}
public class ReferenceParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x =" + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x =" + d.x);

	}
	
	static void change(Data2 d) {   //매개변수로 참조형 매개변수를 받음(주소값, 데이터 읽고 쓰기 둘다 가능)
		d.x = 1000;
		System.out.println("change() : x =" + d.x);
	}

}
