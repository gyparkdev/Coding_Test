import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
    	for(int i=l; i<=r; i++) {
    		if(String.valueOf(i).matches("[05]+")) {
    			arr.add(i);
    		}
    	}
    	
    	if(arr.isEmpty()) {
    		return new int[]{-1};
    	}
    	
    	int[] result = new int[arr.size()];
    	for(int j=0; j<arr.size(); j++) {
    		result[j] = arr.get(j);
    	}
    	
    	return result;
    }
}