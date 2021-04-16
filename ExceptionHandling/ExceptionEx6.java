
public class ExceptionEx6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);//예외 발생!
			System.out.println(4);
		}catch(Exception e) {
			System.out.println(5); //예외가 발생했으므로 실행
		}
		System.out.println(6);

	}

}
