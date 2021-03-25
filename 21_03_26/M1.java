import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] score = new int[5]; //길이가 5인배열 선언
//		int k = 1;
//		
//		score[0] = 50;
//		score[1] = 60;
//		score[k+1] = 70;
//		score[3] = 80;
//		score[4] = 90;
//		
//		int tmp = score[k+2] + score[4]; //int tmp = score[3] + score[4]
//		//for 문으로 배열의 모든 요소를 출력한다.
//		for(int i=0; i<5; i++)
//			System.out.printf("score[%d]=%d%n", i, score[i]);
//		
//		System.out.printf("tmp:%d%n", tmp);
//		System.out.printf("score[%d]:%d%n", 7, score[7]);
		
//		int[] iArr1 = new int[10]; //길이가 10인 배열 생성
//		int[] iArr2 = new int[10];
//		int[] iArr3 = {100,95,80,70,60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		
//		for(int i=0; i<iArr1.length; i++)
//		{
//			iArr1[i] = i+1; //1~10의 숫자를 순서대로 배열에 넣는다.
//			
//		}
//		for(int i=0; i<iArr2.length; i++) {
//			iArr2[i] = (int)(Math.random() * 10) + 1; // 1~10의 값을 배열에 저장
//		}
//		
//		for(int i=0; i<iArr1.length; i++) {
//			System.out.print(iArr1[i] + ",");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(iArr2));
//		System.out.println(Arrays.toString(iArr3));
//		System.out.println(Arrays.toString(chArr));
//		System.out.println(iArr3);
//		System.out.println(chArr);
		
//		int[] arr = new int[5]; //길이가 5인 배열 생성
//		
//		//배열 arr에 1~5를 저장한다.
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i+1;
//			
//		}
//		
//		System.out.println("[변경전]");
//		System.out.println("arr.length:" + arr.length);
//		for(int i=0; i<arr.length; i++) {
//			System.out.println("arr[" + i + "]:" + arr[i]);
//		}
//		
//		int[] tmp = new int[arr.length * 2];
//		
//		for(int i=0; i<arr.length; i++) {
//			tmp[i] = arr[i];
//		}
//		arr = tmp;
//		
//		System.out.println("[변경후]");
//		System.out.println("arr.length:" + arr.length);
//		for(int i=0; i<arr.length; i++) {
//			System.out.println("arr[" + i + "]:" + arr[i]);
//		}
		
//		char[] abc = {'A','B','C','D'};
//		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
//		System.out.println(abc);
//		System.out.println(num);
//		
//		char[] result = new char[abc.length+num.length];
//		System.arraycopy(abc, 0, result, 0, abc.length);
//		System.arraycopy(num, 0, result, abc.length, num.length);
//		System.out.println(result);
//		
//		System.arraycopy(abc, 0, num, 0, abc.length);
//		System.out.println(num); //ABCD456789
//		
//		System.arraycopy(abc, 0, num, 6, 3);
//		System.out.println(num);
		
//		String[] names = {"Kim", "Park","Yi"};
//		
//		for(int i=0; i<names.length; i++)
//		{
//			System.out.println("names:[" + i + "]:" + names[i]);
//		}
//		String tmp = names[2];
//		System.out.println("tmp:" + tmp);
//		names[0] = "Yu";
//		
//		for(String str: names)
//			System.out.println(str);
//		
//		
		int[][] score= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};  //2차원 배열 선언
		//과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호  국어  영어  수학  총점  평균 ");
		System.out.println("---------------------------");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j=0; j<score[i].length; j++){
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			avg = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("=============================");
		System.out.printf("총점: %3d %4d %4d%n", korTotal, engTotal, mathTotal);
		
		


	}

}
