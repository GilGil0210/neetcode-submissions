class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] nums = new int[2];
        Arrays.sort(numbers);
        int right = numbers.length - 1;
        int left = 0;
        while (left < right){
            int sum = numbers[left] + numbers[right];
            if (sum == target){
                nums[0] = left + 1;
                nums[1] = right + 1;
                return nums;
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return nums;
    }
}
