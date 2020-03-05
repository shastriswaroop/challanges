package shastri.swaroop.leetcode.easy;

public class SqrtImpl {
    public static void main(String args[]){
        SqrtImpl sqrt = new SqrtImpl();
        System.out.println(sqrt.mySqrt(24));
    }

    public int mySqrt(int x) {
        if(x<=0){
            return 0;
        }
        int y= 0;
        for(int i=1; i<x/3; i=i+2){
            if(i*i<=x){
                y = i;
                continue;
            } else {
                if((i-1)*(i-1)<=x){
                    y=i-1;
                }
                break;
            }
        }
        return y;
    }
}
