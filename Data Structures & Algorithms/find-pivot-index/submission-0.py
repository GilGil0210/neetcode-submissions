class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        sumforall = sum(nums)
        leftsum = 0
        for i in range(len(nums)):
            rightsum = sumforall - leftsum - nums[i]
            if leftsum != rightsum:
                leftsum+= nums[i]
            else:
                return i
        if rightsum != leftsum:
            return -1
