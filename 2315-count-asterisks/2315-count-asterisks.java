class Solution {
    public int countAsterisks(String s) {
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '*' && count2 % 2 == 0){
                count1++;
            }else if(s.charAt(i) == '|'){
                count2++;
            }
        }
        
        return count1;
    }
}