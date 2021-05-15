import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat");
		set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
		set.add("element"); set.add("elevator"); set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search:from " + from + " to " + to);
		System.out.println("result1 :" + set.subSet(from, to));
		System.out.println("result2 :" + set.subSet(from, to + "zzz"));

	}

}
