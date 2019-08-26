import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String words[]) {
        
        HashSet<String> codedSet = new HashSet<String>();

        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String word : words){
            String code = "";
            for(char ch : word.toCharArray()){
                code += codes[ch - 'a'];
            }
            codedSet.add(code);
        }
        
        
        return codedSet.size();
    }
    
}