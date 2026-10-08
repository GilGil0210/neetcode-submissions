class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFrquency = 0;
        int left = 0;
        for (int right = 0; right < s.length();right++){
            char current = s.charAt(right);
            if (map.containsKey(current)){
                map.put(current, map.get(current)+1);
            }
            else{
                map.put(current, 1);
            }
            maxFrquency = Math.max(map.get(current), maxFrquency);
            int currentsublength = right - left + 1;
            if (currentsublength - maxFrquency > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            maxLength = Math.max(right - left + 1 , maxLength);
        }
        return maxLength;
        
    }
}
