class Solution:
    def customSortString(self, order: str, s: str) -> str:
        output = ""
        the_dict = {}
        remain = ""
        for i in range(len(s)):
            the_dict[s[i]] = the_dict.get(s[i] , 0)+1
        for i in order:
            if i in the_dict:
                output += i * the_dict[i]
                del the_dict[i]
        for key, value in the_dict.items():
            output += key * value

        return output