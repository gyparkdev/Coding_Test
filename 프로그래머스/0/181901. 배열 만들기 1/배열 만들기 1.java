import java.util.*;

class Solution {
    public List solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i=1; k*i<=n; i++) {
			answer.add(k*i);
		}
        return answer;
    }
}