class Solution {
    //해시 맵으로 한다면..? 
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        for(int i =0; i<nums.length; i++){
            mid = (right+left)/2;
            if(nums[mid] == target){
                return mid;
            }
            
            if(target <nums[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        
        }
        
        return left;
        
    }
}