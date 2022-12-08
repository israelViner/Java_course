import java.util.Scanner;

public class main {
     public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);
         
     //Create an object
     APLine Line1 = new APLine(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
     
     //Call to the first method (without any input)
     System.out.println(Line1.getSlope());
     
     //Call to the second method (with to int input)
     System.out.println(Line1.isOnLine(scanner.nextInt(),scanner.nextInt()));
     
     
     }
}