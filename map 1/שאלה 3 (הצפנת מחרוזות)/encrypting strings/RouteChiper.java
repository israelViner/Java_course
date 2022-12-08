public class RouteChiper {
    
    //propreties
    private int numRows = 2;
    private int numColumns = 4;
    private String[][] letterBlock = new String[numRows][numColumns];    
    String A;
    
    //constructor
    public RouteChiper(String str){
       A = new String(str);
    
    }
    
    
    
    
    //mathods
    
    //filling the matrix
    private String[][] fillBlock(String str){
        int pos = 0;
        for(int r = 0; r< numRows; r++){
            for(int c = 0; c< numColumns; c++){
                if (pos < str.length()) {
                    letterBlock[r][c] = str.substring(pos, pos+1);
                    pos++;
                }
                else
                   letterBlock[r][c] = "A";
        
            }
        }
        return letterBlock;
    }
    
    //get the encrypted string in the size of the matrix
    private String encryptBlock(String[][] letterBlock){
        String encryp = "";
        for(int c = 0; c < numColumns; c++){
            for(int r = 0; r< numRows; r++){
                encryp += letterBlock[r][c];
            }
        }
        return encryp;   
    }
    
    
    //get the full encrypted string
    public String encryptMassage() {
        String massage = A;
        String encryptedMassage = "";
        int matrixSize = numRows * numColumns;
        while (matrixSize < massage.length()) {
           String[][] encryp = fillBlock(massage);
           encryptedMassage += encryptBlock(letterBlock);
           massage = massage.substring(matrixSize);
        }
        String[][] encryp = fillBlock(massage);
        encryptedMassage += encryptBlock(letterBlock);
        return encryptedMassage;
    }
}
    
