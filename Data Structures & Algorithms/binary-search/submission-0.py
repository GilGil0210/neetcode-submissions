class Solution:
    def search(self, nums: List[int], target: int) -> int:
        output = 0
        for i in range(len(nums)):
            if nums[i] == target:
                output = i
                break
            else:
                output = -1
        
        return output