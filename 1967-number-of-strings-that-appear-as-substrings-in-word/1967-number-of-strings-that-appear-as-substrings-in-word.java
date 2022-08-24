class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        
        for(int i = 0; i<patterns.length; i++){
            //int num = 0; 
            //for(int j = 0; j<patterns[i].length(); j++){
                if(word.contains(patterns[i])){
                    count++;
                }
           // }
        }
        
        return count;
    }
}