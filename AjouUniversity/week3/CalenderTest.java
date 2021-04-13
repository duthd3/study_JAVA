import java.time.*;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();//몇월인지
		int today = date.getDayOfMonth();//몇일인지
		
		date = date.minusDays(today - 1); //월의 시작으로 이동
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		//1=Mondy...7=Sunday
		
	System.out.println("Mon Tue Wed Thu Fri Sat Sun");
	for(int i=1; i<value; i++)
		System.out.println("  ");
	while(date.getMonthValue() == month)
	{
		System.out.printf("%3d", date.getDayOfMonth());
		if(date.getDayOfMonth() == today)
			System.out.println("*");
		else
			System.out.println(" ");
		date = date.plusDays(1); //increment one day
		if(date.getDayOfWeek().getValue() == 1)
			System.out.println();
	}
	if(date.getDayOfWeek().getValue()!=1)
		System.out.println();
			
	}

}
