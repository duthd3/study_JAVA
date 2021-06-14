import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Employee> staff =new HashMap<>();
		staff.put("144-25-5464", new Employee("AmyLee"));
		staff.put("567-24-2546", new Employee("HarryHacker"));
		staff.put("157-62-7935", new Employee("GaryCooper"));
		staff.put("456-62-5527", new Employee("FrancescaCruz"));
		
		System.out.println(staff);
		staff.remove("567-24-2546");
		staff.put("456-62-5527", new Employee("FrancescaMiller"));
		System.out.println(staff.get("157-62-7935"));
		staff.forEach((k,v)->System.out.println("key=" + k + ", value=" + v.toString()));
	}

}

class Employee{
	private String name;
	Employee(String name){
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
