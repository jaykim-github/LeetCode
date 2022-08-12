class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        
        for(int i =0; i<nums.length;i++){
            for(int j = 1; j<nums.length; j++){
                int num = nums[i] - nums[j];
                if(i<j){
                    if(num == k || num * -1 == k){
                    count++;
                }
                }
                
            }
        }
        
        return count;
    }
}