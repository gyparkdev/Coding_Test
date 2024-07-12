import java.util.*;

class Solution {
    public List solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<Integer>();
		
		for(int i=0; i<intStrs.length; i++) {
			String tmp = intStrs[i].substring(s,s+l);
			if(Integer.parseInt(tmp) > k) {
				answer.add(Integer.parseInt(tmp));
			}
		}
        
        return answer;
    }
}