import java.util.ArrayList;

public class StringToInt {
	public static void main(String[] args) {
		String res = "-";
		String str ="";
		for(int i=0; i<res.length(); i++) {
			if(res.charAt(i)=='.') {
				break;
			}
			else {
				str +=res.charAt(i);
			}
		}
		System.out.println(str);
		System.out.println(change(str));
	}
	public static int change(String str) {
		
		 int x=0;
	        str = str.replaceAll(" ","");
			String strs="";
			for(int i=0; i<str.length(); i++) {
				
				 if(Character.isDigit(str.charAt(0))|| (str.charAt(0)=='-')) {
					   strs= str.replaceAll("[^-0-9]", "");
				}
				else {
					return 0;
				}
			}
			try {
				x= Integer.parseInt(strs);
			}
			catch(Exception ex){
				return -2147483648;
			}
			return Math.round(x);
	}
}
