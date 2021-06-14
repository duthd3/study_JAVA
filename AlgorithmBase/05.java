import java.util.Scanner;
대문자>소문자, 소문자>대문자
public class Main5 {

	public static void main(String[] args) {
		String input = "ABCdef";
		char[] arr;
		arr = input.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(65<=arr[i]&&arr[i]<=97)
				arr[i]=(char)(arr[i]+32);
			else
				arr[i]=(char)(arr[i]-32);
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]);
		}
		
		
	}

}
