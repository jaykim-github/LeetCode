class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int num = -1;
        int answer = 0;
        switch(ruleKey){
            case "type" : num =0;
                break;
            case "color" : num =1;
                break;
            case "name" : num = 2;
                break;
        }
        
        for(int i = 0; i<items.size(); i++){
            if(items.get(i).get(num).equals(ruleValue)){
                answer++;
            }
        }
        
        return answer;
    }
}
