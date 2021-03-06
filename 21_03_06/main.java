import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		int num = 0;
//		
//		while(num < 10) {
//			num++;
//			System.out.print(num + " ");
//		}
//		System.out.println();
//		
//		for(int i=1; i<=10; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
//		for(int i=0; i<=10; i+=2) { //i = i+2
//			
//			
//				System.out.print(i + " ");
//			
//		}
//		System.out.println();
//		
//		for(int i=1; i<=10; i++) {
//			if(i%3 == 0) {
//			System.out.print(i + " ");
//			}
//		}
//		System.out.println();
//		
//		for(int i=0; i<=10; i+=3) { 
//			
//			
//			System.out.print(i + " ");
//		
//	}
//	System.out.println();
		
		//1.1부터 100까지의 정수 출력해 보세요
		//2.53부터 25까지 정수를 출력해 보세요
		//3.30부터 60까지 홀수를 출력해 보세요
		//4.100부터 0까지 5의 배수를 출력해 보세요
		//5.A부터Z까지 출력해 보세요
		//6.1.0부터 3.0까지 0.5단위로 출력해 보세요
		//7.1부터 1000까지 각 수의 제곱값을 출력해 보세요
		//8.정수를 입력 받아서 1부터 입력받은 수까지 출력해 보세요
		//9.정수를 입력 받아서 1부터 입력 받은 수까지 홀수를 출력해 보세요
		//10.정수를 입력 받아서 입력받은 수의 구구단을 출력해 보세요
		
//		for(int i=1; i<=100; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
//		for(int i=53; i>=25; i--) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
//		for(int i=30; i<=60; i++) {
//			if(i%2 != 0) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println();
//		
//		for(char c = 'A'; c<='Z'; c++) {
//			System.out.print(c + " ");
//		}
//		System.out.println();
//		
//		for(float i=1.0f; i<=3.0f; i+=0.5f) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
//		for(int i=1; i<=1000; i++) {
//			System.out.print(i*i + " ");
//		}
//		System.out.println();
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수입력: ");
//		int num = scanner.nextInt();
//		for(int i=1; i<=num; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
//		System.out.println("정수입력: ");
//		int num2 = scanner.nextInt();
//		for(int i=1; i<=num2; i++) {
//			if(i%2 != 0) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println();
//		
//		System.out.println("정수입력: ");
//		int num3 = scanner.nextInt();
//		for(int is=1; is<=9; is++) {
//			System.out.printf("%d*%d = %d", num3, is, num3*is);
//			System.out.println();
//		}
		
		//2단부터 9단까지 출력해 보세요
//		for(int dan=2; dan<=9; dan++) {
//			for(int is=1; is<=9; is++) {
//				System.out.printf("%d * %d =%d", dan, is, dan*is);
//				System.out.println();
//			}
//			System.out.println();
//		}
		
//		for(int h=0; h<24; h++) {
//			for(int m=0; m<60; m++) {
//				for(int s=0; s<60; s++) {
//					System.out.println(h+"시" + m + "분" + s +"초");
//					Thread.sleep(1000);
//				}
//			}
//		}
		//사용자로 부터 분을 입력 받아서 알람시계를 구현해 보세요.
		
//		  int min, mSec, second, sec=60;
//		  Scanner sc = new Scanner(System.in);
//		  
//		  System.out.print("분 입력:");
//		  min =sc.nextInt();
//		  mSec=min*sec;
//		 System.out.println("Ready...");
//		 for(int i=mSec; i>=0; i--) {
//			 min = i/sec;
//			 second = i%sec;
//			 System.out.println(min + "분 " + second + "초 ");
//			 Thread.sleep(1000);
//		 }
//		 System.out.println("Game Start!");
//		 
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("분입력:");
//		int min = scanner.nextInt();
//		
//		
//		for(int h=0; h<24; h++) {
//			for(int m=0; m<60; m++) {
//				
//				for(int s=0; s<60; s++) {
//					System.out.println(h+"시" + m + "분" + s +"초");
//					if(m==1 && s==0) {
//						System.out.println("Game Start!");
//						break;					
//					}
//					Thread.sleep(1000);
//					
//				
//				}
//				break;
//			}
//			break;
//		}	
//		
		
		/*int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}*/
		
/*		int[] card = new int[52];
		
		for(int i=0; i<card.length; i++) {
			card[i] = i+1;
		}
		
		int temp, rIdx;
		for(int i=0; i<100; i++) {
			rIdx=(int)(Math.random()*52);
			temp = card[0];
			card[0] = card[rIdx];
			card[rIdx] = temp;
		}
		
		for(int i=0; i<7; i++) {
			System.out.println(card[i] + " ");
		}
		
		System.out.println();
*/
		//주사위를 10번 던진 후,
		//결과의 값을 짝수, 홀수로 구분해서 출력해 보세요
		
/*		int[] dice = new int[10];
		
		for(int i=0; i<dice.length; i++) {
			dice[i] = (int)(Math.random()*6 + 1);
			System.out.println(i+1 + "번쨰 나온 주사위의 값:" + dice[i]);
			Thread.sleep(500);
		}
		
		System.out.print("짝수 주사위:");
		for(int i=0; i<dice.length; i++) {
			
			if(dice[i]%2 == 0) {
				
				System.out.print(dice[i] + " "  );
				
			}
		}
		
		System.out.println();
		
		System.out.print("홀수 주사위:");
		for(int i=0; i<dice.length; i++) {
			
			if(dice[i]%2 != 0) {
				
				System.out.print(dice[i] + " "  );
				
			}
		}
*/
		//결정장애를 해결 해주는 프로그램
		//개수 입력:
		//항목:
		//항목:
		//항목:
		
		Scanner scanner = new Scanner(System.in);
		int num, random;
	
		
		System.out.print("개수 입력:");
		num = scanner.nextInt();
		String[] name = new String[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("항목:");
			name[i] = scanner.next();
		}
		random = (int)(Math.random()*num);
		System.out.println("선택중입니다...");
		Thread.sleep(1000);
		System.out.println(name[random] +" 이(가) 선택되었습니다.");
		
		

	}

}
