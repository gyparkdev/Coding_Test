import java.util.*;

class Solution {
    public List solution(String myStr) {
        String[] list = {};
		List<String> answer = new ArrayList<String>();
		
		myStr = myStr.replace("a", " ");
		myStr = myStr.replace("b", " ");
		myStr = myStr.replace("c", " ");

		list = myStr.split(" ");
		
		for(int i=0; i<list.length; i++) {
			if(!list[i].equals("")) {
				answer.add(list[i]);
			}
		}
		if(answer.size() == 0) {
			answer.add("EMPTY");
		}
        
        return answer;
    }
}