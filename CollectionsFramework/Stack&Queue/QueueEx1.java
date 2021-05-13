import java.util.*;
public class QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //Queue에 최대 5개까지만 저장되도록 한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		while(true) {
			System.out.println(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				if(input.equalsIgnoreCase("q")) { //대소문자 구별 x
					System.exit(0);
					
			}else if(input.equalsIgnoreCase("help")) {
				System.out.println(" help - 도움말을 보여줍니다.");
				System.out.println(" q또는Q - 프로그램을 종료합니다.");
				System.out.println(" history - 최근에 입력한 명령어를" + MAX_SIZE +"개 보여줍니다.");
			}else if(input.equalsIgnoreCase("history")) {
				int i=0;
				save(input); //입력받은 명령어 저장
				LinkedList tmp = (LinkedList)q;
				ListIterator it = tmp.listIterator();
				
				while(it.hasNext())
					System.out.println(++i+"."+it.next());
			}else {
				save(input);
				System.out.println(input);
			}
			}catch(Exception e) {
				System.out.println("입력오류입니다.");
			}
		}//end while
	}//main()
	public static void save(String input) {
		if(!"".equals(input))
			q.offer(input);
		if(q.size()>MAX_SIZE)
			q.remove();
	}
}//end of class
