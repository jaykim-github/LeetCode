import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        
        String[] arr = s.split("");
        
        for(int i = 0; i<arr.length; i++){
            if(i != arr.length-1 && map.get(arr[i+1]) == 5*map.get(arr[i])){
                sum = sum + map.get(arr[i+1]) - map.get(arr[i]);
                i++;
            }else if(i != arr.length-1 && map.get(arr[i+1]) == 10*map.get(arr[i])){
                sum = sum + map.get(arr[i+1]) - map.get(arr[i]);
                i++;
            }
            else{
                sum += map.get(arr[i]);
            }
        }
        
        return sum;

        
    }
}