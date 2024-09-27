class Solution {
    public int solution(String message) {
        int answer = 0;
        
        String tmp[] = message.split("");
    	answer = tmp.length * 2;
        
        return answer;
    }
}