class Solution {
    public int solution(int hp) {
        int answer = 0;	//개미 수
    	
    	answer += hp/5;
    	hp %= 5;
    	
    	answer += hp/3;
    	hp %= 3;
    	
    	answer += hp/1;
        
        return answer;
    }
}