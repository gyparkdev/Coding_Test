class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int tmp1 = 0;
		int tmp2 = 0;
		
		if(arr1.length == arr2.length) {
			for(int i=0; i<arr1.length; i++) {
				tmp1 += arr1[i];
				tmp2 += arr2[i];
			}
			if(tmp1 > tmp2) {
				answer = 1;
			}else if(tmp1 < tmp2) {
				answer = -1;
			}else {
				answer = 0;
			}
			
		}else if(arr1.length > arr2.length){
			answer = 1;
		}else if(arr1.length < arr2.length) {
			answer = -1;
		}
        
        return answer;
    }
}