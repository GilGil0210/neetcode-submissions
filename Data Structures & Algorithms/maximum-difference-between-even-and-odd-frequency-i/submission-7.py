class Solution:
    def maxDifference(self, s: str) -> int:
        evenFreq = None
        oddFreq = 0
        count = 0
        the_dict={}
        for i in s:
            if i not in the_dict:
                the_dict[i] = 1
            else:
                the_dict[i] += 1
        for value in the_dict.values():
            if value % 2 == 0:
                if evenFreq is None:
                    evenFreq = value
                else:
                    evenFreq = min(value , evenFreq)
            else:
                oddFreq = max(value, oddFreq)
        if oddFreq == 0 and evenFreq is None:
            return -1
        else:
            return oddFreq - evenFreq
            