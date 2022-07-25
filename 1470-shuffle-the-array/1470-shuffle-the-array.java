 class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] arr = new int[nums.length];
        int num1 = 0;
        int num2 = n;
        
        for(int i = 0; i<nums.length; i++){
            if(i%2 == 0){
                arr[i] = nums[num1];
                num1++;
            }else{
                arr[i] = nums[num2];
                num2++;
            }
        }
        
        return arr;
        
    }
}