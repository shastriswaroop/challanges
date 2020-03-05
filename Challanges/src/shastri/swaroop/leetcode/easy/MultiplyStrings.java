package shastri.swaroop.leetcode.easy;

import java.util.Arrays;
import java.util.Calendar;

public class MultiplyStrings {
	public static void main(String []args) {
			String num1 = "9999";// "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";
			String num2 = num1;//"99999999999999999999";
			long i_time = Calendar.getInstance().getTimeInMillis();
			int ln1 = num1.length();
			int ln2 = num2.length();
			int plen = ln1+ln2;
			int prod[] = new int[ln1+ln2];
			
			int[] n1 = new int[ln1];
			int[] n2 = new int[ln2];
			int tmp = 0;
			int carry = 0;
			int pos = 0;
			int init = 0;
			for(int i= n1.length-1; i>=0; i--) {
				init++;
				for(int j= n2.length-1; j>=0; j--) {
					int ni = num1.charAt(i) - '0';
					int nj = num2.charAt(j) - '0';
					tmp = ni * nj;//n1[i] * n2[j];
					//System.out.println(tmp);
					if(tmp>9) {
						prod[plen-pos-1] = prod[plen-pos-1] +tmp%10;
						carry = tmp/10;
						prod[plen-2-pos] = prod[plen-2-pos] + carry;
					} else {
						prod[plen-pos-1] = prod[plen-pos-1] +tmp;
					}
//					System.out.println(prod[plen-2-pos]+"-"+ prod[plen-pos-1]);
					pos++;
				}
				pos = init;

//				pos--;
			}
			for(int k=prod.length-1; k>-1; k--) {
				tmp = prod[k];
				if(tmp>9) {
					prod[k] = tmp%10;
					prod[k-1] = prod[k-1]+ tmp/10;
					
				} else {
					continue;
				}
			}
			
			StringBuilder strBlr = new StringBuilder();
			//strBlr.setLength(prod.length);
			for(int i=0; i<prod.length; i++) {
				strBlr.append(prod[i]);
				//System.out.println(prod[i]);
			}
			long f_time = Calendar.getInstance().getTimeInMillis() - i_time;
				
			System.out.println(f_time);
			System.out.println(strBlr.toString());
	}
}

