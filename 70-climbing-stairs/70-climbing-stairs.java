class Solution {
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }
        
        int result[] = new int[n+1]; 
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        for(int i = 3; i<result.length; i++){
            result[i] = result[i-2] + result[i-1];
        }
        
        return result[n];
    }
}