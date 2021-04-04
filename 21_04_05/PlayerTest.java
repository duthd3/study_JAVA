abstract class Player{//추상 클래스
	abstract void play(int pos);//추상 메서드
	abstract void stop();//추상 메서드
}
//추상 클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos + "위치 부터 play 합니다.");}
	void stop() {System.out.println("재생을 멈춥니다.");}
}

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Player p = new Player();
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer();//리모콘이 추상메서드여도 가리키는 instance가 기능을 다 갖고있다.
		ap.play(100);                 //리모콘 타입과는 상관없다! 실제호출되는건 구현이 다 된 instance.
		ap.stop();
	}

}
