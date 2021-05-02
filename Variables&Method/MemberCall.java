
public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	static int cv2 = new MemberCall().iv; //객체를 생성해야 사용가능.
	
	static void staticMethod1() {
		System.out.println(cv);
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMEthod2() {
		staticMethod1();
		instanceMethod1();
	}
	

}
