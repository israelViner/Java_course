public class question1_specialNumber {
        
   
   //find the number with opposite digits for a given number
   public static int oppositeNumber(int number) {
       int n = number;
       int res=0;
       int power = 0;
       int mod = 0;
       
       while (n > 0) {
           mod = n % 10;
           n = n/10;
           power += 1;
       }
       while (number > 0) {
           mod = number % 10;
           number = number/10;
           res += mod*(Math.pow(10, (power-1)));
           power -= 1;
       }
       return res;
   }
   
   
   //checking if the square-root of a number is integer
   public static boolean intSqrt(int a) {
       double sqrt = Math.sqrt(a);
       return ((int)sqrt == sqrt);
   }
   
   
   //checking if a number is special
   public static boolean special (int number) {
       return (intSqrt(number + oppositeNumber(number)));
   }

}