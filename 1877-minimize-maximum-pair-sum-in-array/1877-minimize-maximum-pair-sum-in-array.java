import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int answer = 0;
        
        for(int i = 0; i<l/2;i++){
            answer = Math.max(answer,nums[i]+nums[l-1-i]);
        }
        
        return answer;
    }
}