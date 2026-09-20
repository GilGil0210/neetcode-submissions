class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < strs.size();i++){
            String s = strs.get(i);
            int lengthOfS = s.length();
            String filter = "#";
            sb.append(lengthOfS);
            sb.append(filter);
            sb.append(s);
        }
        String encoded = sb.toString();
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j)!= '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            int start = j+1;
            String s = str.substring(start, start + length);
            arr.add(s);
            i = start + length;
        }
        return arr;
    }
}
