import java.util.*;
import java.lang.Integer;


public class search_stack {
    
    //properties
    private int num;
    public stack_array stk;
   
    
    //search the place of a number in the stack
    public int numInStack(stack_array s1, int num) {
        stk = s1;
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
                 