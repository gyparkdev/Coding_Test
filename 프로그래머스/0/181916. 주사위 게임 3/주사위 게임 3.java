import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
		int[] dice = {a, b, c, d};
		
		//오름차순 정렬
		Arrays.sort(dice);
		
		// 주사위 4개 같은 경우
		if(dice[0] == dice[3]) {
			answer = 1111 * dice[0];
			
		// 주사위 3개 같은 경우
		}else if(dice[0] == dice[2]) {
			answer = (int)Math.pow((10 * dice[0] + dice[3]), 2);
		}else if(dice[1] == dice[3]) {
			answer = (int)Math.pow((10 * dice[1] + dice[0]), 2);
		
		// 주사위 2개, 2개 값 같은 경우
		}else if(dice[0] == dice[1] && dice[2] == dice[3]) {
			answer = (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]); 
		// 주사위 2개, 나머지 값 다를 경우
		}else if(dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) {

			if(dice[0] == dice[1]) {
				answer = dice[2] * dice[3];
			}else if(dice[1] == dice[2]) {
				answer = dice[0] * dice[3];
			}else {
				answer = dice[0] * dice[1];
			}
		
		// 모두 다를 경우, 가장 작은 수
		}else {
			answer = dice[0];
		}
        
        return answer;
    }
}