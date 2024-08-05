import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] sort = new int[rank.length];
		
		for(int i=0; i<attendance.length; i++) {
			if(attendance[i]) {
				sort[i] = rank[i];
			}else {
				sort[i] = Integer.MAX_VALUE;
			}
		}
		
		Arrays.sort(sort);
		
		for(int i=0; i<rank.length; i++) {
			if(sort[0] == rank[i]) {
				answer += 10000 * i;
			}else if(sort[1] == rank[i]) {
				answer += 100 * i;
			}else if(sort[2] == rank[i]) {
				answer += i;
			}
		}
        
        return answer;
    }
}