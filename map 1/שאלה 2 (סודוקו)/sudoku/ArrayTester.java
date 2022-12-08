public class ArrayTester {
    
    //properties
    public int[][] matrix;
    
    //constructor
    public ArrayTester() {
        
    }
    
    
    //methods
    
    //get a column as an array
    private int[] getColumn(int[][] matrix, int c) {
       int[] arrayColumn = new int[matrix.length];
        for (int r = 0; r < matrix.length; r++) {
           arrayColumn[r] = matrix[r][c];
       }
       return arrayColumn;
    }
    
    
    //duplicates check
    private boolean containDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++){
               if (arr[i]==arr[j])
                 return false;        
           }
        }
        return true;
    }
    
    //comparing 2 arrays
    public boolean comparingArrays(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
               if (a[i]==b[j])
                  break;
               else if (a[i]!= b[b.length-1]) 
                  return false;
                  break;
               //else 
                 // continue;
            }              
        }
        return true;
    }  
    
    
    //comparing all the values in arrays
    public boolean hasAllValues(int[][] matrix) {
        int[] checkArr = new int[matrix.length];
        checkArr = matrix[0]; 
        if (!containDuplicates(checkArr))
           return false;
                     
        for (int c = 0; c < matrix.length; c++) {
            int [] arrColumns = new int[matrix.length];
            arrColumns = getColumn(matrix, c);
            boolean res = comparingArrays(checkArr, arrColumns);
            if (res == false)
               return false;
               break;
        }
            
                
        for (int c = 1; c < matrix.length; c++) {
            int [] arrRows = new int[matrix.length];
            arrRows = matrix[c];
            boolean res = comparingArrays(checkArr, arrRows);
            if (res == false)
               return false;
               break;
            }
        return true;   
    }
        
}
           
//}
//for (int i = 0; i < matrix.length; i++) {
  //          checkArr[i] = matrix[0][i]; 
    //        containDuplicates(checkArr);
      //  }
        
        //for(int b = 0; b < matrix.length; b++)
        
        //for (int i = 0; i < matrix.length; i++) {
               
                
              // int j=0;
               //while (j<(matrix.length)) {
                 //   if(arrColumns[i]== checkArr[j])
                   //     break;
                    //else
                      //  j++;
               //}         
               //if (j>=matrix.length)
                 //      return false;
               //else
                 //      continue;
            //}
            
            
            //for (int i = 0; i < matrix.length; i++) {
              //      int j = 0;
                //    while (j<(matrix.length)) {
                  //     if(arrRows[i]== checkArr[j])
                    //     break;
                      //else
                        //j++;
                    //} 
                    //if (j>=matrix.length)
                      // return false;
                    //else
                      // continue;
            //}