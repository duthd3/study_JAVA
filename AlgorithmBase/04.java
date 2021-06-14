import java.util.Scanner;
//10진수를 2진수로 변환
public class Main4 {

	public static void main(String[] args) {
		int[] arr= new int[100];
		int count=0;
		int a = 0;
	
		System.out.print("10진수를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while(input>0) {
			
			arr[a]=input%2;
			input/=2;			
			count++;
			a++;
			
		}
		
		for(int i=count-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}

}
