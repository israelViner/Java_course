 public class fib {
    //int n;
    
    
    
    
    public int recFib(int n) {
        if (n == 1)
          return 1;
        if (n == 0)
          return 0;
        return (recFib(n - 1) + recFib(n - 2));
    }
    
    public int itrFib(int n) {
        int x = 0;
        int y = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = x + y;
            x = y;
            y = fib;
        }
        return fib;
    }
    
    
    public long dinFib(int n) {
    long[] arr = new long[n + 1];
    for (int i = 0; i <= n; i++)
         arr[i] = -1;
    arr[n] = dinFib(n, arr);
    return arr[n]; 
    }
    
    public long dinFib(int n, long[] arr) {
        //System.out.println(2);
       if (n == 1) {
          arr[n] = 1;
          return arr[n];
       }
       if (n == 0) {
          arr[n] = 0;
          return arr[n];
       }
       if (arr[n] != -1) 
           return arr[n];
       arr[n] = (dinFib(n - 1, arr) + dinFib(n - 2, arr));
       return arr[n];
       }
    }


