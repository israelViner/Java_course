public class mergeSort {
    
        
    public void merge_sort(int[] arr, int n) {
        if (n <= 1)
           return;
        else {
        int mid = n / 2;
        int[] array = arr;
        int[] l = new int[mid]; 
        int[] r = new int[n - mid];
        
        for (int i = 0; i < mid; i++)
            l[i] = array[i];
        for (int j = mid; j < n; j++)
            r[j - mid] = array[j];
               
        merge_sort(l, mid);
        merge_sort(r, n - mid);

        merge(array, l, r, mid, n - mid);
       }
    }
    
    public void merge (int[] arr, int[]l, int[] r, int left, int right) {
       int i = 0;
       int j = 0;
       int q = 0;
       while (i < left && j < right) {
          if (l[i] <= r[j]) {
            arr[q] = l[i];
            q++;
            i++;
          }
          else {
            arr[q] = r[j];
            q++;
            j++;
          }
       }
       while (i < left) {
          arr[q] = l[i];
          q++;
          i++;
       }
       while (j < right) {
          arr[q] = r[j];
          q++;
          j++;
       }
    }
}

    
