class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isTrue = false;
        for (int i = 0; i < nums.length;i++)
        {
            for (int j = i+1; j< nums.length;j++)
            {
                if (nums[j] == nums[i])
                {
                    isTrue = true;
                    break;
                }
            }
        }
        return isTrue;
    }
}