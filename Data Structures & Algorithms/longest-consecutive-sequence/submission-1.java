class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int largest = 1;
        int currentLargest = 1;
        int i = 0;
        while(i<nums.length-1){
            
            if(nums[i+1] - nums[i] == 1){
                currentLargest++;
            }
            else if(nums[i+1] - nums[i] == 0){
                //do nothing
            }
            else{
                currentLargest = 1;
            }
            largest = Math.max(largest, currentLargest);
            i++;
        }
        return largest;
    }
}
