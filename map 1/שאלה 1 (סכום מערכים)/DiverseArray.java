public class DiverseArray {
    
     
    
    //methods 
    
    //sum the values of the array
    public static int arraySum(int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
            sum += arr[i];
        return sum;
    }
      
    //sum the values of the rows entries
    public static int[] rowSums(int [][] arr2D) {
       int[] sums = new int[arr2D.length];
       for (int i = 0; i < arr2D.length; i++)
          sums[i] = arraySum(arr2D[i]);
       return sums;    
    }
    
    
    //checking diverse matrix
    public static boolean isDiverse(int [][] arr2D) {
        int[] sums = new int[arr2D.length]; 
        sums = rowSums(arr2D);
        for (int i = 0; i < sums.length ; i++) {
           for (int j = 0; j < sums.length; j++) {
           //for (int j = i+1; j < sums.length; j++) { 
                if(sums[i] == sums[j] && i!=j)
                       return false;
           }
        }
        return true;
    }
    
   
    
    
}