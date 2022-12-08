public class LCS {
    public int LCS(char[] A, char[] B) {
        int[][] opt = new int[A.length + 1][B.length + 1];
        for (int i = 0; i <= B.length; i++)
           opt[0][i] = 0;
        for (int i = 0; i <= A.length; i++)
           opt[i][0] = 0;
        for (int i = 1; i <= A.length; i++) {
           for (int j = 1; j <= B.length; j++) {
               if (opt[i-1][j] > opt[i][j-1]) 
                        opt[i][j] = opt[i-1][j];
               else
                        opt[i][j] = opt[i][j-1];
               if (A[i - 1] == B[j - 1]) 
                   opt[i][j] = (1 + opt[i-1][j-1] > opt[i][j])? (1 + opt[i-1][j-1]): opt[i][j]; 
           }
        }
        longestCommonSubsequence1(A, B, opt);
        return opt[A.length][B.length];     
    }
    
    // public void back(int[][] opt, char[] A, char[] B) {
        // char[] arr = new char[opt[A.length][B.length]];
        // int j = B.length;
        // for (int i = opt[A.length][B.length]; i > 0; i--) {
            // if (A[i - 1] == B[j - 1] && 1 + opt[i-1][j-1] == opt[i][j]) {
            // System.out.println(A[i - 1] + ",");
            // }
            // j--;
        // }
        // //return arr;
    // }
    
        
public void longestCommonSubsequence1(char [] arr1, char[] arr2 , int [][] matrix){
        int i, j;
        int x = 0;
        i = arr1.length;
        j = arr2.length;
        char [] sequence = new char [matrix[i][j]];
        while(i > 0 && j > 0){
            if (arr1[i -1] == arr2[j-1] && matrix[i-1][j-1] + 1 == matrix[i][j]){
                sequence[x] = arr2[j-1];
                x++;
                i --;
                j --;
            }
            else{
                if(matrix[i][j-1] > matrix[i-1][j])
                    j--;
                else
                    i--;
                }
            }
        for (int a = sequence.length - 1; a >= 0; a--) 
           System.out.println(sequence[a]);
        //return sequence;
    }

    

    }
       
