//학생 이름을 입력하면 이름과 학번이 출력
//반복하여 검색
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String name; //이름
	private String no; //학번
	
	Student(String name, String no){
		this.name = name;
		this.no = no;
	}
	
	public String toString() {
		return "이름: "+name +", 학번: " + no;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	 
}
public class Main {

	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<>();
		Student stu1 = new Student("김철수", "1234");
		Student stu2 = new Student("이유리", "2345");
		Student stu3 = new Student("윤자바", "3456");
		
		arr.add(stu1);
		arr.add(stu2);
		arr.add(stu3);
		
		for(Student st:arr) {
			System.out.println(st.toString());
		}
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("학생 이름을 입력하세요: ");
			Scanner sc = new Scanner(System.in);
			String n = sc.nextLine();
		
			if(n.equals(stu1.getName())) {
				System.out.println(stu1.toString());
			}
			else if(n.equals(stu2.getName())) {
				System.out.println(stu2.toString());
			}
			else if(n.equals(stu3.getName())) {
				System.out.println(stu3.toString());
			}
			else
				System.out.println("없는 학생 입니다.");
		
			System.out.println("계속 검색 하시겠습니까? ");
			String f = sc.nextLine();
			if(f.equals("y")) {
				flag = true;
			}
			else
				flag=false;
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
