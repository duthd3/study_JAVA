
public class CalendarEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date1 = "201508";
		String date2 = "201405";
		
		int month1 = Integer.parseInt(date1.substring(0,4))*12+
				Integer.parseInt(date1.substring(4));
		int month2 = Integer.parseInt(date2.substring(0,4))*12+
				Integer.parseInt(date1.substring(4));
		
		System.out.println(date1 + "과 " + date2 + "의 차이는"+
		Math.abs(month1-month2) + "개월 입니다.");

	}

}
