class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
                int cur =0, total = 0;
        int tmp = 0;
        
        for(int i = 0; i<gas.length; i++){
            total += gas[i] - cost[i];
            cur += gas[i] - cost[i];
            
            if(cur<0){
                tmp = i+ 1;
                cur = 0;
            }
        }
        
        if(total < 0){
            tmp = -1;
        }
        
        return tmp;
    }
}