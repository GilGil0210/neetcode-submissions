class Solution {
    public int[] replaceElements(int[] arr) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++)
        {
            int currentmax = 0;
            for (int j = i + 1; j < arr.length;j++)
            {
                if (arr[j] > currentmax)
                {
                    currentmax = arr[j];
                }
            }
            output[i] = currentmax;
        }
        
        output[arr.length-1] = -1;

        return output;
    }
}