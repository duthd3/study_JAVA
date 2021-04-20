package inheritance;
import java.time.*;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	public Employee(String name, double salary, int year, int month, int day)
	{
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	public String toString(){
		return "Employee:" + name;
	}
	
}

class Manager extends Employee{
	private double bonus;
	public Manager(String name, double salary, int year, int month,int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	public void setBonus(double d) {
		bonus = d;
	}
	public String toString() {
		return "Manager:" + getName();
	}
}
