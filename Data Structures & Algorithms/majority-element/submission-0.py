class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = len(nums)
        themajor = n / 2
        output = 0
        for i in range(n):
            count = nums.count(nums[i])
            if count > themajor:
                output = nums[i]
                break
        
        return output