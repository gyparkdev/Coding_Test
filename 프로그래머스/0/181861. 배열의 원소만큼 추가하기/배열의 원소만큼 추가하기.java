import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> tmp = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i]; j++) {
				tmp.add(arr[i]);
			}
		}
		
		int[] answer = new int[tmp.size()];
		for(int k=0; k<tmp.size(); k++) {
			answer[k] = tmp.get(k);
		}
        
        return answer;
    }
}