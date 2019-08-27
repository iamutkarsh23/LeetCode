import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Creating a hashmp
        int n = nums.length;
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
        int count = 0;
        // Add the element and its count in the hashmap
        for(int i=0; i<n; i++){
            if(hash.containsKey(nums[i])){
                count = hash.get(nums[i]);
                hash.put(nums[i], count+1);
            }
            else{
                hash.put(nums[i], 1);
            }
        }
        
        // iterate through the map and check if count is greater than one, 
        // add it to the new arraylist if it is
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(Entry<Integer, Integer> ent : hash.entrySet()){
            if(ent.getValue() > 1){
                result.add(ent.getKey());
            }
        }
        return result;
    }
}