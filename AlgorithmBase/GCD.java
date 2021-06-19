import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("두 수를 입력하세요>");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int small;
		int big;
		
		if(num1 > num2) {
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small = num1;
		}
		
		int gcd = 1; //최대 공약수
		for(int i=1; i<=small; i++) {
			 if(big % i==0 && small%i == 0)
				 gcd = i;
		}
		
	System.out.println("최대 공약수: " + gcd);	 
	}
	
}
