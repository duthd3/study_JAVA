import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("subinlove", "0120");
		map.put("asdf", "1111");
		map.put("yslove", "0221");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id:");
			String id = s.nextLine().trim();
			
			System.out.print("password:");
			String password = s.nextLine().trim();
			System.out.println();
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다." + " 다시 입력해주세요.");
				continue;
			}else {
				if(!map.get(id).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시입력해주세요.");
					
				}
				else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
		
	}

}
