public class main
{
 public static void main(String[] args) {
 
     
     int [] array = new int [3];
     for (int i = 0; i < array.length; i++)
         array[i] = i + 4;
         
     
    int[][] array2D = new int [4][3];
     for (int i = 0; i < array2D.length; i++)
        for (int j = 0; j < 3; j++)
          array2D[i][j] = j;
         
         
     //print the first method
     int c = DiverseArray.arraySum(array);
     //System.out.println(c);
     
                   
     //print the second method
     int [] a = DiverseArray.rowSums(array2D);
     for (int i=0;i<a.length; i++) {
    //System.out.println(a[i]);
    }
     
     //print the third method     
     int[] k = DiverseArray.rowSums(array2D);
     boolean d = DiverseArray.isDiverse(array2D);
     for (int i=0;i<k.length; i++) {
       System.out.println(k[i]);
    }
    System.out.println(d);
     

     
    
    
    }
}