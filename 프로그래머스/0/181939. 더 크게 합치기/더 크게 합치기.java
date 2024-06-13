class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
		String ba = String.valueOf(b) + String.valueOf(a);
		
		int abVal = Integer.parseInt(ab);
		int baVal = Integer.parseInt(ba);
		
		if(abVal > baVal) {
			return abVal;
		}else {
			return baVal;
		}
        
    }
}