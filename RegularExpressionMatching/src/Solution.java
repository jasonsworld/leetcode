/**
 * Created by yongsheng on 2014/7/26.
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        boolean result = false;
        char[] sCharArray = s.toCharArray();
        char[] pCharArray = p.toCharArray();
        int j = 0;
        while(pCharArray[j] != '.' || pCharArray[j] == sCharArray[0]){
             j++;
            if(j >= p.length()){
                return  false;
            }
        }
        int i = 1, temp = j;
        while(++j < p.length()){
            if(i >= s.length()){
                return true;
            }
            if(pCharArray[j] != '.' && pCharArray[j] != '*'){
                if(pCharArray[j] == sCharArray[i]){
                    i++;
                    continue;
                }else{
                    j = temp + 1;
                    continue;
                }
            }else if(pCharArray[j] == '.'){
                i++;
                continue;
            }else{
                if(pCharArray[j-1] != '.' && pCharArray[j-1] == pCharArray[j+1]){

                }
            }
        }
        return result;
    }
}
