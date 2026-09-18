class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>arr = new ArrayList<>();
        HashMap<Integer, Integer>map = new HashMap<>();
        for (int i = 0; i < nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        int count = 0;
        while(count < k){
            int largest = 0;
            int largestkey = 0;
            for (int key : map.keySet()){
                if (map.get(key) > largest){
                    largest = map.get(key);
                    largestkey = key;
                }
            }
            arr.add(largestkey);
            map.remove(largestkey);
            count++;
        }
        int[] list = new int[arr.size()];
        for (int i = 0; i < arr.size();i++){
            int element = arr.get(i);
            list[i] = element;
        }
        return list;
    }
}
