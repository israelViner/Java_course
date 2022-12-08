public class radixSort {
    private int[] array;
    private int counter;
    int[] tempArray;
    int[] resultArray;
    countingSort sort;
    
    public radixSort(int[] arr) {
        this.array = arr;
        this.counter = 0;
        this.tempArray = new int[this.array.length];
        this.resultArray = new int[this.array.length];
        this.sort = new countingSort(array, 10);
    }
    
    public void setBase() {
        int i = sort.largeNumber(this.array);
        while (i > 0) {
           i = i/10;
           this.counter ++;
        }
    }
    
    public int[] radix_sort() {
        setBase();
        tempArray = new int[this.array.length];
        
        for (int i = 0; i < this.counter; i++) {
            int k = 0;
            for (int j = 0; j < tempArray.length; j++) 
                    tempArray[j] = this.array[j]; 
            while (k < i) {
                for (int s = 0; s < tempArray.length; s++) 
                   tempArray[s] = tempArray[s]/10;
                k++;
            }
            for (int z = 0; z < tempArray.length; z++) {
               tempArray[z] = tempArray[z] % 10;
            }
            
            for(int t = 0; t < sort.helpArray.length; t++)
                sort.helpArray[t] = 0;
                
            sort.fillHelpArray(tempArray);
            sort.amassingHelpArray();
            for (int q = this.array.length - 1; q >= 0; q--) {
                int a = sort.helpArray[this.tempArray[q]];
                this.resultArray[a - 1] = this.array[q];
                sort.helpArray[this.tempArray[q]] -= 1;
            }
            for (int l = 0; l < tempArray.length; l++) {
                this.array[l] = resultArray[l];
            }
        }
        return this.array;
    }
    
    public String toString() {
        String str = "";
        for (int i = 0; i < this.array.length; i++)
              str += this.array[i] + ",";
        return str;
    }
    
}