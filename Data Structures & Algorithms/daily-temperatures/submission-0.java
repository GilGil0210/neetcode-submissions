class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i = 0 ; i < temperatures.length;i++){
            int j = i + 1;
            while(j < temperatures.length){
                if (temperatures[j] > temperatures[i]){
                    result[i] = j - i;
                    break;
                }
                j++;
            }
        }
        return result;
    }
}
