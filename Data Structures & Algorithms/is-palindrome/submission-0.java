class Solution {
    public boolean isPalindrome(String s) {
        String lowS = s.toLowerCase();
        lowS = lowS.replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(lowS).reverse().toString();
        return lowS.equals(reversed);
    }
}
