public class RoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		double sum1=0;
		double sum2=0;
		
		for(double d = 1.5;d<=10.5;d+=1.) {
			double d1 = Math.round(d); //반올림(.5)일때 무조건 반올림
			double d2 = Math.rint(d); //1.5->2.0, 2.5->2.0 (round even 홀수일때 짝수로 반올림)
			
			System.out.printf("%4.1f %4.1f %4.1f %n", d, d1, d2);
			
			sum += d;
			sum1 += d1;
			sum2 += d2;
		}
		
		System.out.println("------------");
		System.out.printf("%4.1f %4.1f %4.1f %n", sum, sum1, sum2);
	}

}
