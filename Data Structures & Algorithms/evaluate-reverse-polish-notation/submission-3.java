class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>theStack = new Stack<>();
        for (String token: tokens){
            if (token.equals("+") || token.equals("-")|| token.equals("*")|| token.equals("/")){
                int number1 = theStack.pop();
                int number2 = theStack.pop();
                int answer = 0;
                if (token.equals("+")){
                    answer = number2 + number1;
                }else if(token.equals("-")){
                    answer = number2 - number1;
                }else if(token.equals("*")){
                    answer = number2 * number1;
                }else{
                    answer = number2 / number1;
                }
                theStack.push(answer);
            }else{
                theStack.push(Integer.parseInt(token));
            }
        }
        return theStack.pop();
    }
}
