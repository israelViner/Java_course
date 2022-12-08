import java.util.*;

public class question5_queue {

    
    Queue<Integer> queue = new LinkedList<Integer>();  
    
    //change half of the terms in the queue
    public static Queue changeHalfQueue(Queue q1) {
        int x;
        int size = q1.size();
        for (int i = 0; i < (size/2); i++) {
            x = (int)q1.remove();
            q1.add(x);
        }
        return q1;
    }
}