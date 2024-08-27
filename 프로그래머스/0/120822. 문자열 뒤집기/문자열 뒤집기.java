class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
    	//다시
    	answer = sb.reverse().toString();
        
        return answer;
    }
}