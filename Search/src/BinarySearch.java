
public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch b = new BinarySearch();
			int[] a = {3,4,5,6,7,8,9};
			System.out.println(regularSearch(a,9));
			System.out.println(b.runBinarySearchRecursively(a,10,0,a.length-1));

	}
	static int regularSearch(int[] arr, int num) {
		int low =0; int high=arr.length-1;
		while(low<=high) {
			int mid = (high+low)/2;
			if(arr[mid]==num) {
				return mid;
			}
			else if(arr[mid]>num) {
				high=mid-1;
			}
			else if(arr[mid]<num) {
				low = mid +1;
			}
		}
		return -1;
	}
	public  int runBinarySearchRecursively(
			  int[] sortedArray, int key, int low, int high) {
			    int middle = (low + high) / 2;
			         
			    if (high < low) {
			        return -1;
			    }
			 
			    if (key == sortedArray[middle]) {
			        return middle;
			    } else if (key < sortedArray[middle]) {
			        return runBinarySearchRecursively(
			          sortedArray, key, low, middle - 1);
			    } else {
			        return runBinarySearchRecursively(
			          sortedArray, key, middle + 1, high);
			    }
			}

}
