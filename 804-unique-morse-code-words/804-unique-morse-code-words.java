import java.util.HashMap; 

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morseCodes[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> codes = new HashSet<>();

        for (String word : words) {
             StringBuilder morseCode = new StringBuilder();
            for (int i = 0, n = word.length(); i < n; i++) {
                morseCode.append(morseCodes[word.charAt(i) - 'a']);
            }
            codes.add(morseCode.toString());
        }

        return codes.size();
    }
}