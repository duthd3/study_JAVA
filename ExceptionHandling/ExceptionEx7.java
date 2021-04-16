
public class ExceptionEx7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);//예외 발생!
			System.out.println(4);
		}catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException"); //예외가 발생했으므로 실행
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);

	}

}
