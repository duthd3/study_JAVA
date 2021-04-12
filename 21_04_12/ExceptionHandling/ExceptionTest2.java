
public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		try {
			System.out.println(0/0);
			System.out.println(2);
		}
			catch(ArithmeticException ae) {
				System.out.println(3);
			
		}
		
		System.out.println(4);
	}

}
