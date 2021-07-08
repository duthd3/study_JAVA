@FunctionalInterface
interface MyFunction{
	void myMethod();
}

public class LamdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction f = ()->{};
		Object obj = (MyFunction)(()->{});
		String str = ((Object)(MyFunction)(()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
	}

}
