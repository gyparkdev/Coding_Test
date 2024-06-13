class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
		int abVal = Integer.parseInt(ab);
		int val = 2*a*b;
		
		if(abVal > val) {
			return abVal;
		}else {
			return val;
		}
    }
}