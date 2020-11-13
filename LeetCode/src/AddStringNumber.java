import java.util.Iterator;
import java.util.LinkedList;

public class AddStringNumber {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(2);
		l1.add(4);
		l1.add(3);
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(5);
		l2.add(6);
		l2.add(4);
		String s1 = changeListToString(l1);
		String s2 = changeListToString(l2);
		String sum = (sumTwoString(s1,s2));
		LinkedList<Character> l3 = new LinkedList<Character>();
		for(int i=0; i<sum.length(); i++) {
			l3.add(sum.charAt(i));
		}
	}
	public static String changeListToString(LinkedList l) {
		String result = "";
		StringBuilder string = new StringBuilder();
		Iterator<?> it = l.descendingIterator();
		while (it.hasNext()) {
		    string.append(it.next());
		}
		result = string.reverse().toString();
		return result;
	}
	
	
	public static String sumTwoString(String s1, String s2) {
		String result = " ";
		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		result = x+y+"";
		StringBuilder sb = new StringBuilder(result);
		return sb.reverse().toString();
	}
}
