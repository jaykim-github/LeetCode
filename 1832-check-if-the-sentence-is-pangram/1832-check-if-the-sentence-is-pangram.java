class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr  = new boolean[26];
        
        for(char c : sentence.toCharArray()){
            arr[c - 'a'] = true;
        }
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != true){
                return false;
            }
        }
        
        return true; 
    }
}