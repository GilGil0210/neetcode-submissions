class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        the_dict = {}
        for word in strs:

            key = "".join(sorted(word))

            if key not in the_dict:
                the_dict[key] = []
            
            the_dict[key].append(word)
        
        return list(the_dict.values())