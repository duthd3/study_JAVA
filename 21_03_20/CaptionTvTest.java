class Tv{
	boolean power; //전원상태
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	boolean caption; //캡션상태
	void displayCaption(String text) {
		if(caption) { //캡션상태가 on일때만 text를 보여준다
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; //조상클래스로부터 상속받은 멤버
		ctv.channelUp(); //조상클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
		
			}
		}
		

	



