package shastri.swaroop.leetcode.easy;

import java.util.Stack;

public class StringWithBrackets {

    public static void main(String...arg){
        String str = "[((}))]";
        StringWithBrackets swb = new StringWithBrackets();
        System.out.println(swb.isValid(str));

    }

    public boolean isValid(String s) {
        char chArr[]= new char[s.length()];
        boolean isValid = true;
        int top = -1;

        for(Character ch: s.toCharArray()) {
            if(ch=='[' || ch=='{' || ch=='('){
                top++;
                chArr[top] = ch;
            }
            if(ch=='}') {
                if(chArr[top]=='{'){
                    chArr[top] = ' ';
                    top--;
                }else {
                    isValid = false;
                    break;
                }
            }
            if(ch==']') {
                if(chArr[top]=='['){
                    chArr[top] = ' ';
                    top--;
                }else {
                    isValid = false;
                    break;
                }
            }
            if(ch==')') {
                if(chArr[top]=='('){
                    chArr[top] = ' ';
                    top--;
                } else {
                    isValid = false;
                    break;
                }
            }
        }

        if(top>-1){
            isValid = false;
        }
       return isValid;
    }
}
