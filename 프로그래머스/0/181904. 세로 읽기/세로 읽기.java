import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        List<String> tmp = new ArrayList<String>();
		
		for(int i=0; i<my_string.length(); i+=m) {
			tmp.add(my_string.substring(i,i+m));
		}
		
		for(int i=0; i<tmp.size(); i++) {
			answer += tmp.get(i).charAt(c-1);
		}
        
        return answer;
    }
}