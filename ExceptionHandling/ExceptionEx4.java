
public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		}catch(Exception e) {
			System.out.println(5); //예외가 발생하지 않았으므로 catch블럭 실행 x
		}
		System.out.println(6);

	}

}
