import java.util.Arrays;

public class major {

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(repert(nums));
		
	}
	public static int repert(int[] arr) {
		Arrays.sort(arr); 
        
        // find the max frequency using linear 
        // traversal 
        int max_count = 1,
        		res = arr[0]; 
        int curr_count = 1; 
          
        for (int i = 1; i < arr.length; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 
      
         //If last element is most frequent 
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arr[arr.length- 1]; 
        } 
      
        return res; 
	}

}
