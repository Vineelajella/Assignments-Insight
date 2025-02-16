package CoreAssignments;

public class Program2 {
	 public static Integer findMaxDistance(int[] arr, int n) {
		 int maxDifference = Integer.MIN_VALUE;
	        int index = -1;

	        for (int i = 0; i < n - 1; i++) {
	            int difference = Math.abs(arr[i] - arr[i + 1]);
	            if (difference > maxDifference) {
	                maxDifference = difference;
	                index = (arr[i] > arr[i + 1]) ? i : i + 1;
	            }
	        }

	        return index;
	    }
	    
	 

}
