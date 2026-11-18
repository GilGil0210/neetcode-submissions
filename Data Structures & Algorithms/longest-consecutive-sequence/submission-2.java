class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int output = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1;i++){
            if (nums[i + 1] - nums[i] == 1){
                output++;
            }else if(nums[i+1]-nums[i] > 1){
                arr.add(output);
                output = 1;
            }
        }
        arr.add(output); // Save the final sequence
        int largest = 0;
        for (int i = 0; i < arr.size();i++){
            if (arr.get(i) > largest){
                largest = arr.get(i);
            }
        }
        return largest;
    }
}
