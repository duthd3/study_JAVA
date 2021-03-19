class Tv{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
	
}

class VCR{
	boolean power;
	int counter = 0;
	void power() {power = !power;}
	void play() { System.out.println("hello");}
	void stop() {}
	void ewq() {}
	void ff() {}
	
}
public class TVCR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VCR vcr = new VCR();
		
		void play() {
			vcr.play();
			
		}
		
		void stop() {
			vcr.stop();
		}
		void rew() {
			vcr.rew();
		}
		
		void ff(){
			vcr.ff();
		}
		

	}

}
