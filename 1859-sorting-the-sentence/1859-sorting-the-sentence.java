class Solution {
    public String sortSentence(String s) {
        String[] arr1 = s.split(" ");
        String[] arr2 = new String[arr1.length];
        for(int i = 0; i<arr1.length;i++){
            int j = Integer.parseInt(arr1[i].substring(arr1[i].length()-1));
            arr2[j-1] = arr1[i].substring(0,arr1[i].length()-1);
        }
        String result = "";
        for(int i = 0; i<arr2.length-1; i++){
            result += arr2[i] + " ";
        }
        
        result += arr2[arr2.length-1];
        
        return result;
    }
}
