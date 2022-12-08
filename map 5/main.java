public class main {
    public static void main(String[] args) {
        //fib fibo = new fib();
        //cutRod cut = new cutRod();
        // int i = 1;
        // while (true) {
        // System.out.println(i + ": "+ fibo.dinFib(i));
        // //System.out.println(i + ": "+ fibo.itrFib(i));
        // //System.out.println(i + ": "+ fibo.recFib(i));
        // i++;
    // }
    char a = 'a';
    char b = 'b';
    char c = 'c';
    char d = 'd';
    char e = 'e';
    char f = 'f';
    char g = 'g';
    char h = 'h';
    
    //int[] price = {0,3,10,8,9,10,17,17,20}; 
    //System.out.println(cut.cutRod(price, 8)); 
    char[] arr1 = {a,h,b,g,f,d,a,g,h,e};
    char[] arr2 = {a,b,c,d,f,h,g,c,e};
    LCS lcs = new LCS();
    System.out.println(lcs.LCS(arr1, arr2));

    //System.out.println(lcs.back(arr1, arr2));    
      
        
    }
}