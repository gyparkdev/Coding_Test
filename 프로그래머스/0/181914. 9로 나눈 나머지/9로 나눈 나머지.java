class Solution {
    public int solution(String number) {
        int answer = 0;
        String [] numList = number.split("");
        
		for(int i=0; i<numList.length; i++) {
			answer += Integer.parseInt(numList[i]);
		}
		return answer%9;
    }
}