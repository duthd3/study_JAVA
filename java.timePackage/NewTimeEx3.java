import java.time.*;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTomorrow implements TemporalAdjuster{
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2, ChronoUnit.DAYS);
	}
}
public class NewTimeEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTomorrow());
		
		System.out.println(today);
		System.out.println(date);
		System.out.println(today.with(firstDayOfNextMonth()));  //다음 달의 첫날
		System.out.println(today.with(firstDayOfMonth())); //이달의 첫날 
		System.out.println(today.with(lastDayOfMonth())); // 이달의 마지막 날 
		System.out.println(today.with(firstInMonth(TUESDAY))); //이달의 첫번쨰 화요일 
		System.out.println(today.with(lastInMonth(TUESDAY))); //이달의 마지막 화요일 
		System.out.println(today.with(previous(TUESDAY))); //지난 주 화요일 
		System.out.println(today.with(previousOrSame(TUESDAY)));  //지난 주 화요일(오늘 포함) 
		System.out.println(today.with(next(TUESDAY))); // 다음주 화요일 
		System.out.println(today.with(nextOrSame(TUESDAY))); //다음주 화요일(오늘 포함) 
		System.out.println(today.with(dayOfWeekInMonth(4, TUESDAY))); //이달의 4번째 화요일 
		
		
	}

}
