class Solution {
    public String truncateSentence(String s, int k) {
        String arr[] = s.split(" ");
        
        String answer = "";
        
        for(int i = 0; i<k;i++){
            answer += arr[i] + " ";
        }
        
        return answer.substring(0,answer.length()-1);
    }
}