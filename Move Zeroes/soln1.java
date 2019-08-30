class Solution {
    public void moveZeroes(int[] nums) {
        int lenNums = nums.length; 
        int j = 0;
        for(int i=0; i<lenNums; i++){
            if(nums[i] != 0 ){
                int temp = nums[j]; 
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}