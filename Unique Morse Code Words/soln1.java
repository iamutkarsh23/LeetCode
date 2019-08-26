import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String words[]) {
        
        HashMap<String, String> morseCodes = new HashMap<String,String>();
        
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int start = 97;
        for(int i=0; i<26; i++){
            morseCodes.put(Character.toString((char) start) , codes[i]);
            start++;
        }
        
        // TO check the morseCode HashMap 
        // for(String s : morseCodes.keySet()){
        //     String key = s.toString();
        //     String value = morseCodes.get(s).toString();  
        //     System.out.println(key + " " + value); 
        // }
        
        String[] transformations = new String[words.length]; 
        
        for(int i=0; i<words.length; i++){
            String decodedRes = "";
            
            String word = words[i];
            for(int j=0; j<word.length(); j++){
                decodedRes += morseCodes.get(String.valueOf(word.charAt(j)));
            }
            // Checking the desired result 
            // System.out.println(decodedRes);
            transformations[i] = decodedRes;
        }
        
        Arrays.sort(transformations);
        
        //for(String d : transformations){
        //    System.out.println(d);
        //}
        
        HashSet<String> codedSet = new HashSet<String>();
        for(int i=0;i<transformations.length; i++){
            codedSet.add(transformations[i]);
        }
        
        return codedSet.size();
    }
    
}