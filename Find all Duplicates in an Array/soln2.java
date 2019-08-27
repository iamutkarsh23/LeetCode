import java.util.ArrayList;

public class Solution {

    // the main idea here is to negate the positions and check if the element there has already been negated, then that number has occured twice
    
    public List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> resultArr = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index] < 0){
                resultArr.add(index+1);
            }
            nums[index] = -nums[index];
        }
        return resultArr;
    }
}