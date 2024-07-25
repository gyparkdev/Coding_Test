import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(String str : strArr) {
			int length = str.length();
			map.put(length, map.getOrDefault(length, 0) + 1);
		}
		
		for(int cnt : map.values()) {
			answer = Math.max(cnt, answer);
		}
        
        return answer;
    }
}