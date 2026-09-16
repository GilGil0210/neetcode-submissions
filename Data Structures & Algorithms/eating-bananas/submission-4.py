class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        left = 1
        right = max(piles)
        res = right
        while left <= right:
            speed = (left+right)//2
            total = 0
            for pile in piles:
                total += math.ceil(pile/speed)
            if total <=h:
                res = speed
                right = speed - 1
            else:
                left = speed + 1
        return res
