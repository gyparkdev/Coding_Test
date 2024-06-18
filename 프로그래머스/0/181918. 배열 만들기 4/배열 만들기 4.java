import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
		
		int i = 0;
		while(i<arr.length) {
			if(tmp.size() == 0) {
				tmp.add(arr[i]);
				i++;
			}else {
				int last = tmp.get(tmp.size()-1);
				if(last < arr[i]) {
					tmp.add(arr[i]);
					i++;
				}else {
					tmp.remove(tmp.size()-1);
				}
			}
		}
		
		int[] stk = new int[tmp.size()];
		for(int j=0; j<tmp.size(); j++) {
			stk[j] = tmp.get(j);
		}
        return stk;
    }
}