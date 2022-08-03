import java.util.*;

class Solution {
    public String restoreString(String s, int[] indices) {
        String arr[] = new String[indices.length];
        
        for(int i = 0; i<indices.length; i++){
            arr[indices[i]] = s.substring(i,i+1);
        }
        
       // arr = Arrays.sort(arr);
        
        String a = "";
        for(int j = 0; j<arr.length; j++){
            a += arr[j];
        }
        
        return a;
    }
}