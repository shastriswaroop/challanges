package shastri.swaroop.leetcode.easy;

public class LongestCommonPrefix {
    public static void main(String...str){
        String strs[] = {"1flower" , "flow", "flight"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(strs));

    }

    private String longestCommonPrefix(String[] strs){
        if(strs==null || strs.length==0){
            return "";
        }
        String prefix = strs[0];
        for(int i=1; i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
           }
        return prefix;
    }

}
