import java.util.ArrayList;

public class RemoveDublicate {

	public static void main(String[] args) {
		String[] s = {"Apple","BaLL","Cat"};
		String[] a = {"apple","ball","vat"};
		String[] b = {"A","B","C"};
		String[] c = {"A","22","c"};
		
		System.out.println(count(s));
		
	}
	public static String count(String[] arr) {
		int count=0;
		int totalCount=0;
		String s="";
		for(int i=0; i<arr.length; i++) {
			s=arr[i];
			for(int j=0; j<arr[i].length(); j++) {
				totalCount++;
				if(Character.isLetter(s.charAt(j))) {
					if(Character.isUpperCase((s.charAt(j)))){
						count++;

					}
				}
				else {
					return "Invalid input";
				}
			}
		}
		if(count==totalCount) {
			return "All of them are Uppercase";
		}
		return count+"";
	}
	
}
