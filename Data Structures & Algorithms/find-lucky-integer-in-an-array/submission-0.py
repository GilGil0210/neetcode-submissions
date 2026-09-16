class Solution:
    def findLucky(self, arr: List[int]) -> int:
        the_dict = {}
        for i in range(len(arr)):
            if arr[i] not in the_dict:
                the_dict[arr[i]] = 1
            else:
                the_dict[arr[i]]+=1
        output = []
        for key, value in the_dict.items():
            if key == value:
                output.append(key)
        if output == []:
            return -1
        output = max(output)
        return output
                
        