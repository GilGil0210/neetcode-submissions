class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        the_dict = {")" : "(", "}" : "{" , "]" : "["}
        isTrue = False
        for c in s:
            if c in the_dict:
                if stack and stack[-1] == the_dict[c]:
                    stack.pop()
                else:
                    return False

            else:
                stack.append(c)
        if not stack:
            isTrue = True
        
        return isTrue