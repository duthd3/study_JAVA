import java.util.*;
import static java.util.Collections.*;

public class CollectionsEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2); //오른쪽으로 2칸이동
		System.out.println(list);
		
		swap(list, 0, 2);
		System.out.println(list);
		
		shuffle(list);
		System.out.println(list);
		
		sort(list);
		System.out.println(list);
		
		sort(list, reverseOrder()); //역순 정렬
		System.out.println(list);
		
		int idx = binarySearch(list, 3);
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max=" + max(list));
		System.out.println("min=" + min(list));
		System.out.println("min=" + min(list, reverseOrder()));
		
		fill(list, 9); //list를 9로 채운다.
		System.out.println("list = " + list);
		
		List newList = nCopies(list.size(), 2); //list와 같은크기의 새로운 list를 생성하고 2로채운다.
		System.out.println("newList =" + newList);
		
		System.out.println(disjoint(list, newList));
		
		copy(list, newList);
		System.out.println("newList=" + newList);
		System.out.println("list=" + list);
		
		replaceAll(list, 2, 1);
		System.out.println("list=" + list);
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		System.out.println("list2 = " + list2);
		
		

	}

}
