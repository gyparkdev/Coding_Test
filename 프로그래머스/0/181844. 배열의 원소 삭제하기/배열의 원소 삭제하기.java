import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<Integer>();
		
		for(int i : arr) {
			answer.add(i);
		}
		
		for(int i : arr) {
			for(int j : delete_list) {
				if(i == j) {
					answer.remove(Integer.valueOf(i));
				}	
			}
		}
        
        return answer;
    }
}