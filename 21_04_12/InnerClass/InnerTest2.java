
public class InnerTest2 {
	class InstanceInner{
		int iv = 100;
//		static int cv = 100; //에러! static 변수 선언x
		final static int CONST = 100; //final static은 상수
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200; //static 클래스만 static변수 선언o
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
//			static int cv = 300; //에러!static변수를 선언할 수 없다.
			final static int CONST = 300;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST);//에러 지역 내부 클래스는 메서드 내에서만
		
	}
}
