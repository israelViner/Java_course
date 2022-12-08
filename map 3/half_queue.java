import java.util.*;

public class half_queue {

    private queue_array que;
       
    //change half of the terms in the queue
    public queue_array changeHalfQueue(queue_array q1) {
        que = q1;
        int x;
        int size = q1.size();
        for (int i = 0; i < (size/2); i++) {
            x = (int)q1.denqueue();
            q1.enqueue(x);
        }
        return q1;
    }
}