class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.replaceAll("[a-zA-z]", "").split("");
    	for(String a : arr) {
    		answer += Integer.parseInt(a);
    	}
        
        return answer;
    }
}