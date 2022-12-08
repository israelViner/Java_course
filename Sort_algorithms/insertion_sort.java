public class insertion_sort {
    
    public int[] insertionSort(int[] a) {
        int j;
        int i;
        int num;
        int temp;
        for (i = 1; i < a.length; i++) {
          if (a[i] < a[i - 1]) {
            num = a[i];
            j = i - 1;
            while (j >= 0 && num < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = num;
          }
        }
        return a;
    }
}