public class question3_crossArray{
    
    //sort the (cross) array
    public static int[] crossSort(int[] arr) {
        int[] sortArray = new int[arr.length];
        int i = 0;
        int j = arr.length - (arr.length % 2) - 1;
        for (int a = 0; a < arr.length; a++) {
           if ((i<arr.length) && (arr[i] < arr[j] || j<0)) {
              sortArray[a] = arr[i];
              i = i + 2;
           }
           else {
             sortArray[a] = arr[j];
             j = j - 2;
           }
    }
    return sortArray;
        
           
           
    }
    
    //binari search in the cross array
    public static int binariSearch(int[] arr, int x) {
        int i = 0;
        int j = arr.length;
        int k = ((arr.length)/2);
        int q = ((arr.length)/2) - 1;
        
        while (arr[k] != x && (j-i) > 2) {
            System.out.println("1:  i:" +i +"j:"+j + "k:"+k);
            if (arr[k] > x) {
                j = k; 
                k = k/2 - (k/2 % 2);
            }
            else if ((k + (j - k)/2) % 2 == 0) {
                     i = k;
                     k = k + ((j - k)/2);
                 }
                 else  {
                    i = k;
                    k = k + ((j - k)/2) - 1;
                }
            System.out.println("2:  i:" +i +"j:"+j + "k:"+k);
        }
        if (arr[k] == x)
          return k;
        else  {
            i = 0;
            j = arr.length;
            while (arr[q] != x && (j-i) > 2) {
                System.out.println("3:  i:" +i +"j:"+j + "q:"+q);
              if (arr[q] > x) {
                 if ((q + ((j - q)/2)) % 2 == 1) {
                     i = q + 2;
                     q = q + ((j - q)/2);
                 }
                 else {
                    i = q + 2;
                    q = q + ((j - q)/2) - 1;
                }
              }
              else if (((q/2) % 2) == 1) {
                  j = q - 1; 
                  q = q/2;
                }
              else {
                   j = q - 1;  
                   q = q/2 - 1;
                }
            System.out.println("4: i:" +i +"j:"+j + "q:"+q);
            }
        }
        if (arr[q] == x)
           return q;
        else
           return Integer.MIN_VALUE;
    }
}