final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(s==null)
			s = new Singleton();
		return s;
	}
}
public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton s = new Singleton();  기본 생성자가 private 접근제어자를 가지므로.
		Singleton s = Singleton.getInstance();

	}

}
