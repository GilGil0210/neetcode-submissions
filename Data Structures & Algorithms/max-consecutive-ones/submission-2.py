class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        large = 0
        for i in range(len(nums)):
            count = 0
            for j in range(i , len(nums)):
                if nums[j] == 0:
                    break
                else:
                    count+=1
            large = max(large, count)
        return large

