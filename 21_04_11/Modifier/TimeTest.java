class Time{
	private int hour; //0~23 사이의 값을 가져야함
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isValidHour(hour)) return;
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if(minute<0 || minute>59) return;
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		if(second<0 || second>59) return;
		this.second = second;
	}
	private boolean isValidHour(int hour) { //매개변수로 넘겨지 hour가 유효한지 확인해서 알려주느 메서드
		return hour<0 || hour>23;
	}
	
	public int getHour() { return hour;}
	public int getMinute() { return minute;}
	public int getSecond() { return second;}
}

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
		t.setHour(22);
		t.setMinute(55);
		t.setSecond(50);
		System.out.println(t.getHour() + "시" + t.getMinute() + "분" + t.getSecond() + "초");
		t.setHour(100);
		System.out.println(t.getHour());

	}

}
