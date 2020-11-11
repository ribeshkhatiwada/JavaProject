import java.util.ArrayList;

public class checkPal {

	public static void main(String[] args) {
		System.out.println(check("abcba"));
	}
	public static boolean check(String s) {
		ArrayList<Character> str = new ArrayList<Character>();
		for(int i=0; i<s.length(); i++) {
			if(str.contains(s.charAt(i))) {
				str.remove((Character)s.charAt(i));
			}
			else {
				str.add((Character)s.charAt(i));
			}
		}
		if((s.length()%2==0)&&(str.isEmpty()) || ((s.length()%2==1)&&(str.size()==1)))
		return true;
		return false;
	}
	}


