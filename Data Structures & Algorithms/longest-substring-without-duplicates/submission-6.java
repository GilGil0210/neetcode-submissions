class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Set<Character> seen = new HashSet<>();
        for (int right = 0; right < s.length();right++){
            char current = s.charAt(right);
            while(seen.contains(current)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(current);
            int length = right - left + 1;
            if(maxLength < length){
                maxLength = length;
            }
        }
        return maxLength;
    }
}
