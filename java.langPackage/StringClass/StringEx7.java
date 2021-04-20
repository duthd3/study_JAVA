
public class StringEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "Hello.java";
		//fullName에서 '.'의 위치를 찾는다.
		int index = fullName.indexOf('.');
		//fullName의 첫번째 글자부터 '.'이 있는 곳까지 문자열을 추출한다.
		String fileName = fullName.substring(0, index);
		
		//'.'의 다음 문자 부터 시작해서 문자열의 끝까지 추출한다.
		String ext = fullName.substring(index+1);
		
		System.out.println(fullName +  "의 확장자를 제외한 이름은" + fileName);
		System.out.println(fullName +  "의 확장자는" + ext);
		

	}

}
