//fibonacci수열

public class Main2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 1;
		
		System.out.print(arr[0]+" ");
		System.out.print(arr[1]+" ");
		for(int i=2; i<10; i++) {
			arr[i] = arr[i-1]+arr[i-2];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//2번쨰 방법.
		int prevPrevNum = 1; //An-2
		int preNum = 1; //An-1
		int temp=0;
		System.out.print(prevPrevNum+" ");
		System.out.print(preNum+" ");
		for(int i=2; i<10; i++) {
			System.out.print(prevPrevNum+preNum+" ");
			
			temp=prevPrevNum;
			prevPrevNum=preNum;
			preNum=temp+preNum;
		}
	}

}
