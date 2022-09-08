class Solution {
    public boolean isPalindrome(String s) {
       String arr = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        int j = arr.length()-1;
        for(int i = 0; i<arr.length()/2; i++){
            if(arr.charAt(i) != arr.charAt(j)){
                return false;
            }
            
            j--;
        }
    
     return true;
    }
}