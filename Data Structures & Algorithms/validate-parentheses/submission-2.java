class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int start = 0;
        for (int i = 0;i < s.length() ;i++){
            char current = s.charAt(i);
            if (current == '{' || current =='[' || current == '('){
                st.push(current);
            }
            else{
                if (st.empty()){
                    return false;
                }
                char peek = st.peek();
                if (current == ')' && peek == '('){
                    st.pop();
                }
                else if (current == '}' && peek == '{'){
                    st.pop();
                }
                else if (current == ']' && peek == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.empty();
    }
}
