import java.util.*;
import java.lang.Integer;


public class stack_array {
    //propreties
    int[] elements;
    int last;
    
    public stack_array(int size) {
        this.elements =  new int[size];
        this.last = -1;
    }
    
    public boolean push(int x) {
        if (this.last == this.elements.length - 1)
           return false;
        else {
           this.last += 1;
           this.elements[last] = x;
           return true;
        }       
    }
        
    public int pop() {
        int i = this.elements[last];
        //elements[last] = Integer.MIN_VALUE;
        this.last -= 1;
        return i;
    }
    
    public boolean isEmpty() {
        if (this.last < 0)
           return true;
        else
           return false;
    }
}
    
