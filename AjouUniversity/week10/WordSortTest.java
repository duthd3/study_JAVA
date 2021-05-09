import java.util.*;

class LengthComparator implements Comparator<String>
{
	public int compare(String first, String second)
	{
		return first.length() - second.length();
	}
}
public class WordSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Lee", "Chang", "Hong"};
		Arrays.sort(names,(first,second) -> second.length()-first.length());
		System.out.println("names=" + Arrays.toString(names));
	}

}
