
public class ReferenceParamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr); //배열의 모든 요소 출력
		sortArr(arr); //배열을 정렬
		printArr(arr);
		System.out.println("sum =" + sumArr(arr)); //배열의 총합을 출력
		

	}
	
	static void printArr(int[] arr) {
		System.out.print("[");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	static void sortArr(int[] arr) { //배열을 오름차순으로 정렬
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	} // end of sortArr

}
