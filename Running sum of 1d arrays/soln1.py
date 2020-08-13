# Brute force soln

class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        newArr = nums
        for i in range(len(nums)):
            temp = nums[i]
            for j in range(0,i):
                temp = nums[i] + nums[j]
            newArr[i] = temp
        return newArr