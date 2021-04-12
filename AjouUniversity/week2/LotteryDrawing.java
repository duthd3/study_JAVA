import java.util.*;

public class LotteryDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many numbers to draw?");
		int k = in.nextInt();
		
		System.out.println("what is the highest number?");
		int n = in.nextInt();
		
		int numbers[] = new int[n];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		int result[] = new int[k];
		for(int i=0; i<result.length; i++) {
			int r = (int)(Math.random()*n);
			
			result[i] = numbers[r];
			numbers[r] = numbers[n-1];
		}
		Arrays.sort(result);
		System.out.print("결과:");
		for(int r:result) {
			System.out.println(r);
		}
		
		

	}

}
