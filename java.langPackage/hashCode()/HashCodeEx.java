
public class HashCodeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());//String클래스는 문자열의 내용이 같으면, 동일한 해시코드 반환
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));//모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장
		System.out.println(System.identityHashCode(str2));

	}

}
