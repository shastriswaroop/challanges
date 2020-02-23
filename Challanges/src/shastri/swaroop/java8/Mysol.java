package shastri.swaroop.java8;

import java.util.ArrayList;
import java.util.List;

public class Mysol {
	public static void main(String...arg) {
		List<Integer> lst1 = new ArrayList();
		List<Integer> lst2 = new ArrayList();
		List<Integer> lst3 = new ArrayList();
		lst1.add(1);
		lst1.add(2);
		lst1.add(3);
		lst2.add(4);
		lst2.add(5);
		lst2.add(6);
		lst3.add(7);
		lst3.add(8);
		lst3.add(9);

/*		lst1.add(1);
		lst1.add(8);
		lst1.add(3);
		lst2.add(4);
		lst2.add(9);
		lst2.add(6);
		lst3.add(7);
		lst3.add(2);
		lst3.add(5);
*/		
		List<List<Integer>> myList = new ArrayList<List<Integer>>();
		
		myList.add(lst1);
		myList.add(lst2);
		myList.add(lst3);
		
		System.out.println(find_largest_in_row_smallest_in_column_element_in_matrix(myList));
	}
	
	
    public static int find_largest_in_row_smallest_in_column_element_in_matrix(List<List<Integer>> matrix) {
   //     int maxArr[] = new int[matrix.size()];
   //     int idxArr[] = new int[matrix.size()];
        int tmpData=-1;
        int tmpColIdx=0;
        int data= -1;
        List<Integer> tmpLst;
        int maxInRow;
        
        //System.out.print(matrix.size());
        for(int i=0; i<matrix.size();i++){
            tmpLst = matrix.get(i);
            maxInRow = matrix.get(i).get(0);
            data= -1;
            for(int j=0; j<matrix.get(i).size();j++){
                if(maxInRow < matrix.get(i).get(j) ){
                	maxInRow = matrix.get(i).get(j);
                	tmpData  = maxInRow;
                	tmpColIdx = j;
                } 
            }
            boolean flag = true;
            for(int row=0;row<matrix.size();row++) {
            	if(tmpData>matrix.get(row).get(tmpColIdx)) {
            		flag=false;
            		data = -1;
            		break;
            	} else {
            		data =tmpData;
            	}
            }
            
            if(!flag) {
            	break;
            }
            
            if(data!=-1) {
            	break;
            }
            // found out max value and index in row
            System.out.println(tmpData+ " , " +maxInRow);
            
          //  matrix.forEach(e->System.out.println(e));
        }
        
        
        
        
        
        return data;
    }
}
