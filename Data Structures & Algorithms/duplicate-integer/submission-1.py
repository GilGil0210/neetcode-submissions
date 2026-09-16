class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        newarr = sorted(nums)
        isTrue = False
        for i in range(len(newarr) - 1):
            if newarr[i] == newarr[i + 1]:
                isTrue = True
            
        return isTrue