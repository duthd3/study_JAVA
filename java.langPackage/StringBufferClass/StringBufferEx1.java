
public class StringBufferEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2? " + (sb==sb2)); //false
		System.out.println("sb.equals(sb2)? " + sb.equals(sb2));//false
		
		//StringBuffer의 내용을 String으로 변환한다.
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ?" + s.equals(s2));

	}

}
