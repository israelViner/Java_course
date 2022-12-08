public class main {
    public static void main(String[] args) {
        hashTable hash = new hashTable(10);
        
        for (int i = 0; i < 100; i++) {
            hash.addToHash(i);
        }
        
        
        hash.deleteFromHash(5);
        hash.deleteFromHash(15);
        hash.deleteFromHash(25);
        
        System.out.println(hash.searchInHash(3));
        System.out.println(hash.searchInHash(5));
        System.out.println(hash.searchInHash(27));
        System.out.println(hash.searchInHash(25));

        
        System.out.println(hash);
    
    }
}




