class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        output = [0] * n

        for i in range(n):
            the_time = 1
            for j in range(n):
                if i == j:
                    continue
                else:
                    the_time *= nums[j]
            output[i] = the_time

        return output
