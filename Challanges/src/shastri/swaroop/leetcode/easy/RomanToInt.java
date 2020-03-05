package shastri.swaroop.leetcode.easy;

import java.util.Map;
import java.util.HashMap;

public class RomanToInt {
    public static void main(String...arg){
        RomanToInt rti = new RomanToInt();
        System.out.println(rti.romanToInt("XVIII"));
    }
    private int getValue(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
    public int romanToInt(String s) {
        int sum = 0;
        int prevDigit;// = 0;
        int currDigit;// = 0;
        for(int i= s.length()-1;i>-1; i--){
            if(i==s.length()-1){
                prevDigit =  getValue(s.charAt(i));
                sum = prevDigit;
            } else {
                prevDigit =  getValue(s.charAt(i+1));
                currDigit =  getValue(s.charAt(i));

                if(currDigit < prevDigit){
                    sum = sum - currDigit;
                } else {
                    sum = sum + currDigit;
                }
            }
        }
        return sum;
    }

}
