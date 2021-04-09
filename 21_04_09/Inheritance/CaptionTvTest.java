class Tv{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}
public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; // 상속받은 멤버
		ctv.channelUp(); //상속받은 멤버
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World"); //caption이 false이기 때문에 출력x
		ctv.caption = true;
		ctv.displayCaption("Hello, World");//caption이 true이기 떄문에 출력o
		
	}

}
