import java.util.*;
class Employee{
	String name;
	int salary;
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
}
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Employee("Carl Cracker", 75000));
		staff.add(new Employee("Harry Hacker", 50000));
		staff.add(new Employee("Tony Tester", 40000));
		for(Employee e : staff) {
			System.out.println("name:" + e.name + "salary:" + e.salary );
		}
		
	}

}
