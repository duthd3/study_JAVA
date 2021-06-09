import java.util.Scanner;

public class Alg03 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int j=0;
		int m=0;
		for(int k=0; k<10; k++) {
			arr[k]=0;
		}
		for(int i=0; i<10; i++) {
			int input = sc.nextInt();
			arr[input]+=1;			
		}
		for(j=0; j<10; j++) {
			if(max<arr[j]) {
				max=arr[j];
				 m = j;
			}
			
		}
		
		System.out.printf("최빈값:%d, 횟수:%d", m, max);
	}
	

}
