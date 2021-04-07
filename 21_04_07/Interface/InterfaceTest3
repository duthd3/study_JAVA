public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.methodA();
		

	}

}
class A{
	void methodA() {
		I i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}

interface I{
	public abstract void methodB();
}

class B implements I{
	public void methodB() {
		System.out.println("methodB in class");
	}
	public String toString() {return "class B";}
}

class InstanceManager{
	public static I getInstance() {
		return new B();
	}
}
