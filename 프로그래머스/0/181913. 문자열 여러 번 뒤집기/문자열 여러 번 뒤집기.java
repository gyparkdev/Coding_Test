class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
		
		for(int i=0; i<queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			
			String str = sb.substring(start, end+1);
			StringBuilder reverseStr = new StringBuilder(str).reverse();
			sb.replace(start, end+1, reverseStr.toString());
		}
		answer = sb.toString();
        
        return answer;
    }
}