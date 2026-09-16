class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        the_dict = {}
        output = []
        for i in nums:
            if i not in the_dict:
                the_dict[i] = 1
            else:
                the_dict[i] +=1
        i = 0
        while i < k:
            currentlarge = max(the_dict.values())
            for j in the_dict:
                if the_dict[j] == currentlarge:
                    output.append(j)
                    the_dict[j] = 0
                    break
            i+=1
        return output
            
