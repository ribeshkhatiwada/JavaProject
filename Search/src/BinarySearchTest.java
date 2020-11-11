
public class BinarySearchTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,7,10,15,18};
		System.out.println(search(arr,15));
	}
	public static int search(int[] arr, int number) {
		int low =0;
		int high = arr.length-1;
		while(high>= low) {
			int mid = (low+high)/2;
			if(arr[mid]==number) {
				return mid;
			}
			else if(arr[mid]>number) {
				high = mid-1;
			}
			else if(arr[mid]<number) {
				low = mid+1;
			}
		}
		return -1;
	}

}
