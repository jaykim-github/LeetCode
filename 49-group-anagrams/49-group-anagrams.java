import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for(int i = 0; i<strs.length; i++){
            char[] charArr = strs[i].toCharArray(); 
            Arrays.sort(charArr); 
            String result = new String(charArr);
                
            if(!map.containsKey(result)){
                map.put(result, new ArrayList());
            }
            map.get(result).add(strs[i]);
        }
        
        
        return new ArrayList<>(map.values());
    }
}