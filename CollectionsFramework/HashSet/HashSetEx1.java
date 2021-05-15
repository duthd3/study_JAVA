import java.util.*;

public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objArr= {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			
			System.out.println(set.add(objArr[i]));
		}
		
		System.out.println(set);
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.print(it.next());
	}

}
