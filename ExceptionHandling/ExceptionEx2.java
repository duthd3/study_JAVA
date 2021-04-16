
public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
				result = number / (int)(Math.random() * 10); //0이 나오면 에러 발생
				System.out.println(result);
			}catch(ArithmeticException e) {
				System.out.println("0"); //0이나와 에러 발생할 시에 출력되는 문장.
			}
			
		}
	}

}
