/**
 * Created by yongsheng on 2014/10/23.
 */
public class Solution {
    public int singleNumber(int[] A) {
        int length = A.length;
        int result = 0;
        for(int i = 0; i < length; i++) {
            result = result ^ A[i];
        }
        return result;
    }
}
