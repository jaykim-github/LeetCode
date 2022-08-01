class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        int arr[] = new int[sum];
        int num = 0;
        for(int j = 0; j<nums.length; j+=2){
          for(int k = nums[j]; k > 0; k--){
              arr[num] = nums[j+1];
              num++;
          }
        }
        
        return arr;
    }
}