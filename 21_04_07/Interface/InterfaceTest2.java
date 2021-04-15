class A{
	void autoPlay(I i) {
		i.play();
	}
}

interface I{
	public abstract void play();
}

class B implements I{//class B가 interface I 구현
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements I{//class C가 interface I 구현
	public void play() {
		System.out.println("play in C class");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());

	}

}
