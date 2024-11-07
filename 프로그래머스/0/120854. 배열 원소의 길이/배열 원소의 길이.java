import java.util.*;

class Solution {
    public List solution(String[] strlist) {
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
    	int cnt = 0;
    	
    	for(int i=0; i<strlist.length; i++) {
    		for(int j=0; j<strlist[i].length(); j++) {
    			cnt++;
    		}
    		answer.add(cnt);
    		cnt = 0;
    	}
        return answer;
    }
}