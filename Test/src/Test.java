import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public static LinkedList<Integer> list = new LinkedList<Integer>();
	public static void maxEvenVer3() {
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next() % 2 ==0) {
				itr.remove();
			}
		}
	}
	public static void main(String[] args) {
		list.add(6);
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(2);
		maxEvenVer3();
		for (Integer num : list) {
			System.out.println(num);
		}
		
	}

}
