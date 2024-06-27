import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> tmp = new ArrayList<String>();
        
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                tmp.add(strArr[i]);
            }
        }
        
        String[] answer = new String[tmp.size()];
        
        for(int j=0; j<tmp.size(); j++){
            answer[j] = tmp.get(j);
        }
        
        return answer;
    }
}