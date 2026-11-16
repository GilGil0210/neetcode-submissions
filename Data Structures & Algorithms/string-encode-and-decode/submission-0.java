class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        String endcoded_string = "";
        for (int i = 0; i < strs.size();i++){
            endcoded_string += strs.get(i).length() + "#" + strs.get(i);
        }
        return endcoded_string;
    }

    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> decoded = new ArrayList<String>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));

            String word = str.substring(j+1, j+1+length);
            decoded.add(word);
            i = j + 1 + length;
        }
        return decoded;
    }
}
