package test;
import java.util.Arrays;
import java.util.Stack;

public class Rever {

	public static void main(String[] args) {
        long startTime = System.nanoTime();
		String sentence = " ";
		System.out.println(reverseSentence("This is test"+sentence,startTime));
		System.out.println(rev("This is test",startTime));
		System.out.println(reve("This is test",startTime));

		
	}

	public static String reverseSentence(String str, long startTime) {
		System.out.println(startTime);
		String s = "";
		int track = 0;
		Stack<Character> ch = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				track++;
				ch.push(str.charAt(i));
			} else {
				for(int j=track; j>0; j--) {
					s += ch.pop();
				}
				s+=" ";
				track =0;
			}
		}
		System.out.println(System.nanoTime());
        long elapsedTime = System.nanoTime() - startTime;
        System.err.println(elapsedTime+" in nano second");
		return s;
	}
	public static String rev(String s ,long startTime) {
		System.out.println(startTime);
		String[] spl = s.split(" ");
		String rev= "";
		for(String st : spl) {
			StringBuilder str = new StringBuilder(st);
			str.reverse();
			rev +=str+ " ";
		}
		System.out.println(System.nanoTime());
		 long elapsedTime = System.nanoTime() - startTime;
	        System.err.println(elapsedTime+" in nano second");
		return rev.trim();
	}
	public static String reve(String s,long startTime) {
		System.out.println(startTime);
		String[] spl = s.split(" ");
		String rev= "";
		for(String st : spl) {
			rev +=revs(st);
		}
		System.out.println(System.nanoTime());
		 long elapsedTime = System.nanoTime() - startTime;
	        System.err.println(elapsedTime+" in nano second");
		return rev.trim();
	}
	public static String revs(String s) {
		String rev = "";
		for(int i=s.length()-1;i>=0; i--) {
			rev +=s.charAt(i);
		}
		return rev+" ";
	}
}
