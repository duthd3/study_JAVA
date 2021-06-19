import java.util.Scanner;
//소수 찾기
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------소수 판독기--------------");
		System.out.print("숫자를 입력하세요>");
		
		int input = sc.nextInt();
		int count = 0;
		boolean isPrimeNumber = true;
		
		if(input==2) {
			System.out.println("소수입니다.");
		}
	
			
		for(int i=2; i<input; i++) {
			if(input%i==0) {//한번이라도 나누어 떨어지면 소수가 아니다.
				isPrimeNumber = false;
				
			}
		}
	
		if(isPrimeNumber) {
			System.out.println(input +" 은 소수 입니다.");
		}
		else {
			System.out.println(input +" 은 소수가 아닙니다.");
		}
		
	}

}
