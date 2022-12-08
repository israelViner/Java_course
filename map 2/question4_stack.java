import java.util.*;
import java.lang.Integer;


public class question4_stack {
    
    //properties
    int num;
    public Stack stk = new Stack();
   
    
    //search the place of a number in the stack
    public static int numInStack(Stack stk, int num) {
        int x;
        int temp=0;
        if (stk.isEmpty())
            return Integer.MIN_VALUE;
        else { 
              x = (int)stk.pop();
          if (x != num) {
               temp = 1 + numInStack(stk, num);
               stk.push(x);
               return temp;
            }
           else 
               return temp;
        }
                                     
    
    
    }    
}   

