
public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		}catch(Exception e) {
			e.printStackTrace();
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
