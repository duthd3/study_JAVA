
public class WrapperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i=" + Integer.parseInt("100"));
		System.out.println("i=" + Integer.parseInt("100", 10)); //위와 동일
		System.out.println("i=" + Integer.parseInt("100", 2));
		System.out.println("i=" + Integer.parseInt("FF", 16));
	}

}
