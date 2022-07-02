package Stack_Interview_Problems;

import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();

        String s = "{}()[{]}}";
        if(s.length()%2 !=0){
            System.out.println("not valid parenthesis");
            return;
        }
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == ')'){
                if(!st.empty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else if(s.charAt(i) == '}'){
                if(!st.empty() &&st.peek() == '{' ){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else if(!st.empty() && s.charAt(i) == ']'){
                if(st.peek() == '['){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else{
                st.push(s.charAt(i));
            }

        }

        if(st.empty()){
            System.out.println("Valid Parenthesis");
        }
        else{
            System.out.println("Not Valid Parenthesis");
        }
    }

}
