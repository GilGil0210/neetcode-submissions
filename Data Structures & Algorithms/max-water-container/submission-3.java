class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxWater = 0;
        while(left < right){
            int times = right - left;
            int smallerWall = Math.min(heights[left], heights[right]);
            int amountOfWater = smallerWall * times;
            if (maxWater < amountOfWater){
                maxWater = amountOfWater;
            }
            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}
