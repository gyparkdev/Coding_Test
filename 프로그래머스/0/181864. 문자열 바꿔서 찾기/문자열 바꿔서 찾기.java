class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String myStrings = myString.replace("A", "X").replace("B", "A").replace("X", "B");
		
		if(myStrings.contains(pat)) {
			answer = 1;
		}
        
        return answer;
    }
}