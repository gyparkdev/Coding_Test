import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int min = 10000000;
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 2) {
				min = Math.min(min, i);
				max = Math.max(max, i);
			}
		}
		
		if(min <= max) {
			answer = Arrays.copyOfRange(arr, min, max+1);
		}else {
			answer = new int[] {-1};
		}
        
        return answer;
    }
}