public class main {
    public static void main(String[] args) {
        int b[] = new int[39];
        for (int i = 0; i < b.length; i++)
            b[i] = (int)(Math.random()*1000);
        
         for (int i = 0; i < b.length; i++)
              System.out.print(b[i] + ",");
              System.out.println();

              
        // insertion_sort d = new insertion_sort();
        // countingSort c = new countingSort(b);
        
        // radixSort f = new radixSort(b);
        
          
              
        // f.radix_sort();      
        // System.out.println(f);
        
      
        
        
        // d.insertionSort(b);
        // for (int i = 0; i < 7; i++)
           // System.out.print(b[i] + ",");
        // System.out.println(c);   
        // System.out.println();   
        // c.countSort();
        // System.out.println(c);
        
        
        mergeSort m = new mergeSort();
        m.merge_sort(b,39); 
        
        for (int j = 0; j < b.length; j++) 
              System.out.print(b[j] + ",");
              System.out.println();
              
    }
}