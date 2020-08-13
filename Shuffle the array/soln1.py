import copy
class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        newArr = copy.deepcopy(nums) 
        j=1
        for i in range(n):
            newArr[i*2] = nums[i]
        for i in range(n,len(nums)):
            newArr[j] = nums[i]
            j+=2
        return newArr
        