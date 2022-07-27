class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        String arr1[] = jewels.split("");
        String arr2[] = stones.split("");
        
        int count = 0;
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i].equals(arr2[j])){
                    count++;
                }
            }
        }
        
        return count;
    }
}