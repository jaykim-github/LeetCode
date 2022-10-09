import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        int sum = 0;
        int count = 0;
        Arrays.sort(cost);
        
        for(int i = cost.length-1; i>=0; i--){
            if (count != 2){
                sum += cost[i];
                count++;
            } else{
                count = 0;
            }
           
        }
        
        return sum;
    }
}