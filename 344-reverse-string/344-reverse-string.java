class Solution {
    public void reverseString(char[] s) {
        int j = s.length-1;
        char tmp = 0;
        int i = 0;
        
        while(i<j){
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            
            i++;
            j--;
        }
    }
    
}