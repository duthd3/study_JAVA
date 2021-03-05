public class TvTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv[] tvArr = new Tv[3];
		
		//Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for(int i=0; i<tvArr.length; i++)
		{
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		for(int i=0 ;i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
		}

	}

}

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
