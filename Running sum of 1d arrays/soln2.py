# O(n) solution. 
# stores the last calculated element to be added to next

class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        temp = nums[0]
        for i in list(range(1,len(nums))):
            nums[i] = temp + nums[i]
            temp = nums[i]
        return nums


# Faster than above solution 

class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        for i in list(range(1,len(nums))):
            nums[i] = nums[i-1] + nums[i]
        return nums