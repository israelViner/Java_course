import java.util.*;
import java.lang.Integer;


public class queue_list {
    //propreties
    private intNode elements;
    private int last;
    private int Size;
    
    public queue_list(int size) {
        this.elements =  new intNode(0, null);
        this.Size = size;
        this.last = -1;
    }
    
    public boolean enqueue(int x) {
        if (this.elements.Length() == this.Size + 1)
            return false;
        else {
            this.last += 1;
            this.elements.addToEnd(x);
            return true;
        }       
    }
        
    public int denqueue() {
        int i;
        i = this.elements.getNext().getValue();
        i = this.elements.getNext().getValue();
        this.elements.setNext(this.elements.getNext().getNext());
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
    
