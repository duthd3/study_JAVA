import java.io.*;

public class ExceptionEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = createFile(""); //command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
		System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
	}
	
	static File createFile(String fileName) {
		try {
			if(fileName==null || fileName.equals(""))
				throw new Exception("파일이름이 유효하지 않습니다.");
		}catch(Exception e) {
			fileName = "제목없음.txt";
		}
		
		finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	static void createNewFile(File f) {
		try {
			f.createNewFile();
			
		}catch(Exception e) {}
	}

}
