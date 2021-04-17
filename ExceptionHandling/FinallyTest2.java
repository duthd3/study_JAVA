
public class FinallyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall();
			copyFiles();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			deleteTempFiles();
		}
		

	}



	static void startInstall() {
	//
	}
	static void copyFiles() {
		
	}
	static void deleteTempFiles() {
		
	}
}
