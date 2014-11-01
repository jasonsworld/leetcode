/**
 * Created by yongsheng on 2014/10/25.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0, maxIndex = 0, minIndex = 0, min = 0, max = 0;
        int length = prices.length;
        if(length != 0){
            min = prices[0];
            max = prices[0];
        }
        if(length >=2){
            for(int i = 0; i < length - 1;){
                while(i < length-1 && prices[i] <= prices[i+1]){
                    max = prices[++i];
                    maxIndex = i;
                }
                if(maxIndex > minIndex){
                    sum += (max - min);
                    maxIndex = 0;
                    minIndex = 0;
                }
                while(i < length-1 && prices[i] > prices[i+1] ){
                    min = prices[++i];
                    minIndex = i;
                }
                if(maxIndex > minIndex){
                    sum += (max - min);
                    maxIndex = 0;
                    minIndex = 0;
                }
            }
        }
        return sum;
    }
}
