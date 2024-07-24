class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

		for(int i=0; i<my_string.length(); i++) {
			char c = my_string.charAt(i);
			
			if(c>='A' && c<='Z') {
				answer[c-'A']++;	// 대문자 A-Z의 인덱스는 0-25
			}else if(c>='a' && c<='z') {
				answer[c-'a'+26]++;	// 소문자 a-z의 인덱스는 26-51
			}
		}
        
        return answer;
    }
}