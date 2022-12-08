   
    public class Tester
{
    public static void main(String[] args)
    {
        
       //***question 1***    
        
        intNode list = null;
        list=new intNode(1,null);
        list=new intNode(2,list);
        list=new intNode(3,list);
        list=new intNode(4,list);
        list=new intNode(5,list);
        list=new intNode(6,list);
        list=new intNode(7,list);
        // System.out.println(list);
        
        
       //***checking the functions***
        
       // System.out.println();
       // System.out.println(list.Length());
       //list.addToStart(5);
       // System.out.println(list.Length());
       // System.out.println(list);
       // list.addToEnd(7);
       // System.out.println(list);
       // System.out.println(list.Length());
       
       
       
       
       // list.remove(2);
       // System.out.println(list);
       
        // list.reverse();
        // System.out.println(list);
       
       //list.printReverse();
       
       
       //***question 2 - 5:***
       
       //***create the stacks & queues***
       stack_array stack1 = new stack_array(4);
       stack_list stack2 = new stack_list(4);
       queue_array queue1 = new queue_array(4);
       queue_list queue2 = new queue_list(4);
       
       // //***fill the stacks & arrays (the two first based on a array)***
       
       // stack1.push(1);
       // stack1.push(2);
       // stack1.push(3);
       // stack1.push(4);
       
       // queue1.enqueue(1);
       // queue1.enqueue(2);
       // queue1.enqueue(3);
       // queue1.enqueue(4);
       
       stack2.push(6);
       stack2.push(7);
       stack2.push(8);
       stack2.push(9);
                  
       // queue2.enqueue(6);
       // queue2.enqueue(7);
       // queue2.enqueue(8);
       // queue2.enqueue(9);
       
       
       //***checking the functions***
       // System.out.println(stack1.isEmpty());
       // System.out.println(stack2.isEmpty());
       //System.out.println(queue1.isEmpty());
       // System.out.println(queue2.isEmpty());
       
       //System.out.println();
       
       //for (int i = 0; i < 4; i++) 
       
       // System.out.print(stack1.pop());
       System.out.print(stack2.pop());
       //System.out.print(stack2.elements);
       //System.out.print(queue1.denqueue());
       // System.out.print(queue2.denqueue());
       //System.out.println(queue1.isEmpty());
       
       
       //***the questions from map 2***
       // half_queue que = new half_queue();
       // search_stack sta = new search_stack();
       // System.out.println(sta.numInStack(stack1, 2));
       // que.changeHalfQueue(queue1);
       // for (int i = 0; i < 4; i++)
          // System.out.println(queue1.denqueue());
       
    }


}
    
    

    
