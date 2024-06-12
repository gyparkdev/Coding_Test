class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int len1 = overwrite_string.length();
        int len2 = my_string.length();
        String str1 = my_string.substring(0, s);
        String str2 = my_string.substring((s+len1), len2);
        
        answer += str1 + overwrite_string + str2;
        
        return answer;
    }
}