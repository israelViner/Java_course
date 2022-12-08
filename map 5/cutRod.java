public class cutRod {
    
    public int cutRod(int[] price, int n) {
        int[] opt = new int[price.length];
        int max;
        int temp;
        opt[0] = 0;
        opt[1] = price[1];
        for (int i = 2; i < price.length; i++) {
            max = 0;
            temp = i;
            opt[i] = price[i];
            while (temp > 0 && (temp >= i - temp)) {
                if ((opt[temp] + opt[i - temp]) > max)
                max = (opt[temp] + opt[i - temp]);
                temp--;
            }
            opt[i] = max;
        }
        return opt[n];
    }
    
    
}