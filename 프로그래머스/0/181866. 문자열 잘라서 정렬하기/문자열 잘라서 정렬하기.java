import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
		List<String> array = new ArrayList<String>();
		
		for(int i=0; i<arr.length; i++) {
			if(!arr[i].isEmpty()) {
				array.add(arr[i]);
			}
		}
		
		String[] answer = new String[array.size()]; 
		
		for(int i=0; i<array.size(); i++) {
			answer[i] = array.get(i);
		}
		
		Arrays.sort(answer);
        
        return answer;
    }
}