class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        ArrayList<Integer> answer = new ArrayList<>();
        while(k>0){
            int largest = 0;
            int number = 0;
            for (int key : map.keySet()) {
                if (map.get(key) > largest) {
                    largest = map.get(key);
                    number = key;
                }
            }
            answer.add(number);
            map.remove(number);
            k--;
        }
        int[] array = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            array[i] = answer.get(i);
        }
        return array;
    }
}
