public class countingSort {
    private int[] originArray;
    public int[] helpArray;
    private int[] resultArray;
    private int large;
    
    
     public countingSort(int[] arr, int a) {
       this.originArray = arr;
       this.helpArray = new int[10];
       this.resultArray = new int[arr.length];
       this.large = largeNumber(this.originArray);
    }
    
    public countingSort(int[] arr) {
      this.originArray = arr;
      this.resultArray = new int[arr.length];
      this.large = largeNumber(this.originArray);
      this.helpArray = new int[this.large + 1];
    }
    
    public int largeNumber(int[] arr) {
        for (int i = 0; i < this.originArray.length; i++) {
            if (this.originArray[i] > this.large)
                 this.large = originArray[i];
        }
        return large;
    }
    
    public void initialHelpArray() {
        for (int i = 0; i < this.large; i++)
           this.helpArray[i] = 0;
    }
    
    public void fillHelpArray(int[] arr) {
        int[] array = arr;
        for (int i = 0; i < array.length; i++)
             this.helpArray[array[i]] += 1;
    }
    
    public void amassingHelpArray() {
        for (int i = 1; i < this.helpArray.length; i++) {
            this.helpArray[i] += this.helpArray[i - 1];
        }
    }
    
    public int[] countSort() {
        largeNumber(this.originArray);
        initialHelpArray();
        fillHelpArray(this.originArray);
        amassingHelpArray();
        for (int i = this.originArray.length - 1; i >= 0; i--) {
            int k = this.helpArray[this.originArray[i]];
            this.resultArray[k - 1] = this.originArray[i];
            this.helpArray[this.originArray[i]] -= 1;
        }
        for (int i = 0; i < this.originArray.length; i++)
            this.originArray[i] = this.resultArray[i];
        return this.originArray;
    }
    
    public String toString() {
        String str = "";
        for (int i = 0; i < this.originArray.length; i++)
              str += this.originArray[i] + ",";
        return str;
    }
    
}