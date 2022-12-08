public class APLine {
    
    //properties
    private int A;
    private int B;
    private int C;

    
    //constructor
    public APLine (int a, int b, int c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }
     
    //methods
    
    //Calculating slope
    public double getSlope() {
        return (-A/(double)B);
    }
    
    
    //Checking point
    public boolean isOnLine(int x, int y) {
        return (A*x + B*y + C)==0;
    }
    
}