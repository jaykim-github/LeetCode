class Solution {
    public void sortColors(int[] nums) {
        int tmp = 0;
        int num = 0;
       
        while(tmp<nums.length){
            int min = nums[tmp];
            for(int i = tmp+1; i<nums.length; i++){
                if(min>nums[i]){
                    min = nums[i];
                    num = i;
                    
                    nums[num] = nums[tmp];    
                    nums[tmp] = min;
                }   
            }
            
            
            
            tmp++;
            min = Integer.MAX_VALUE;
        }
        
    }
}