class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()> s2.length()){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        for (int i = 0; i <= s2.length()-s1.length();i++){
            String temp = s2.substring(i, i + s1.length());
            char[] arr2 = temp.toCharArray();
            Arrays.sort(arr2);
            if (Arrays.equals(arr2, arr1)){
                return true;
            }
        }
        return false;
    }
}
