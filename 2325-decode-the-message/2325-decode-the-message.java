import java.util.HashMap;

class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        
        key = key.replaceAll(" ", "");
        
        char ch = 'a';
        int num = 0;
        
       for(int i = 0; i<key.length(); i++){
           if(!map.containsKey(key.charAt(i))){
               map.put(key.charAt(i),ch);
               ch++;
           }
       }
        
        String str = "";
        
        for(int i = 0; i<message.length(); i++){
            if(!map.containsKey(message.charAt(i))){
                str += " ";
            }else{
                str += map.get(message.charAt(i));
            }
            
        }
        
        return str;
    }
}