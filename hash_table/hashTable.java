public class hashTable {
    private intNode[] hashArray;
    private int size;
    
    
    public hashTable(int size) {
        this.size = size;
        this.hashArray = new intNode[size];
        for (int i = 0; i < hashArray.length; i++) 
           hashArray[i] = new intNode(Integer.MIN_VALUE, null);
    }
    
    public void addToHash(int n) {
        this.hashArray[n % this.size].addToStart(n);
    }
    
    public boolean searchInHash(int n) {
        intNode p;
        for (p = this.hashArray[n % this.size]; p != null; p = p.getNext()) {
           if (p.getValue() == n)
              return true;
        }
        return false;
    }
    
    public void deleteFromHash(int n) {
        this.hashArray[n % this.size].remove(n);
    }
    
    public String toString() {
        String str = "";
        for (int i = 0; i < this.size; i++) {
            this.hashArray[i].remove(Integer.MIN_VALUE);
            str += "list " + i + ": ";
            while (this.hashArray[i] != null) {
               str += this.hashArray[i].getValue() + "-->";
               this.hashArray[i] = this.hashArray[i].getNext();
            }
        }
        return str;
    }
}