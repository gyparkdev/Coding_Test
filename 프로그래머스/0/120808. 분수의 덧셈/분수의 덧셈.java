class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 두 분수의 분자를 더하고, 분모를 계산
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        // 최대공약수를 찾기 위한 변수
        int max = 1;
        
        // 1부터 numer와 denom 중 작은 값까지 반복하며 최대공약수를 찾음
        for (int i = 1; i <= numer && i <= denom; i++) {
            if (denom % i == 0 && numer % i == 0) {
                max = i;
            }
        }

        // 최대공약수로 분자와 분모를 나눠 기약분수로 변환
        numer = numer / max;
        denom = denom / max;

        // 결과를 배열로 반환
        int[] answer = {numer, denom};
        return answer;
    }
}