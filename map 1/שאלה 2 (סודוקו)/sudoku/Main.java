public class Main 
{
  public static void main(String[] args) {
      
    ArrayTester array1 = new ArrayTester();
      
    int[][] array2D = new int [2][2];
    //for (int i = 0; i < array2D.length; i++)
        //for (int j = 0; j < 3; j++)
          array2D[0][0] = 5;
          array2D[0][1] = 7;
          array2D[1][0] = 7;
          array2D[1][1] = 5;
    
          
          
    System.out.println(array1.hasAllValues(array2D));  
  }
}