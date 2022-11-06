class Solution {
    public String capitalizeTitle(String title) {
        String str[] = title.split(" ");

        for(int i = 0; i<str.length; i++){
            if(str[i].length()<=2){
                str[i] = str[i].toLowerCase();
            }else{
                str[i] = str[i].substring(0,1).toUpperCase() + str[i].substring(1).toLowerCase();
            }
        }

        String result = "";

        for(String s : str){
            result += s + " ";
        }

        return result.trim();
    }
}
