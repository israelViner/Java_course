import java.util.*;
import java.lang.Integer;


public class stack_list {
    //propreties
    public intNode elements;
    private int last;
    private int Size;
    
    public stack_list(int size) {
        elements =  new intNode(0, null);
        this.Size = size;
        this.last = -1;
    }
    
    public void push(int x) {
        if (this.elements.Length() == Size)
             return;
        else {
            last += 1;
            //System.out.println(this.elements.getValue());
            //System.out.println(this.elements);
            this.elements.addToStart(x);
            //System.out.println(elements);
        }       
    }
        
    public int pop() {
        int i = this.elements.getValue();
        this.elements.setNext(this.elements.getNext().getNext());
        last -= 1;
        return i;
    }
    
    public boolean isEmpty() {
        if (this.last <= 0)
           return true;
        else
           return false;
    }
}
    
