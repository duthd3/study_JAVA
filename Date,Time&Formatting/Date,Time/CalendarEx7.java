import java.util.*;
public class CalendarEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=2) {
			System.out.println("Usage: java CalendarEx7 2015 11");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1, 1);
		eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
		
		sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK)+1);
		eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("     "+year +"년 "+month+"월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int n=1; sDay.before(eDay)|| sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
			int day = sDay.get(Calendar.DATE);
			System.out.println((day<10) ? "  "+day : " "+ day);
			if(n++%7==0)System.out.println();
		}
		
		
		

	}

}
