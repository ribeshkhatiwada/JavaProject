import java.util.ArrayList;
import java.util.List;

public class FindSingleNumberINArray {

	public static void main(String[] args) {
		int[] arr = {1};
		singleNumber(arr);

	}

	public static void singleNumber(int[] arr) {
		int[] y = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					y[i] = arr[j];
				}
			}
		}
		 System.out.println(compare(arr, y));
	}

	public static int compare(int[] arr1, int[] arr2) {
		boolean contains = false;
		int x =0;
		if(arr1.length==1) {
			return arr1[0];
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					contains = true;
					break;
				}
			}

			if (!contains) {
				x= arr1[i];
			} else {
				contains = false;
			}
		}
		return x;
	}
}
