class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        result = 0
        for i in range(len(nums)):
            for j in range(i):
                if(nums[i] == nums[j]):
                    result +=1
        return result