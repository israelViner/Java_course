import java.util.*;   

class BinaryTree {
      
    // Root of Binary Tree
    Node root;
    stack_array sta = new stack_array(20);
    
    //Stack<Node> stk = new Stack<Node>();  
    // Constructors
    BinaryTree(int key) { root = new Node(key); }
  
    BinaryTree() { root = null; }
    
    public void addN(int n) {
        addNode(n, this.root);
    }
    
    
    public void addNode(int n, Node t) {
        if (t == null) {
           t = new Node(n);
           return;
        }
        else {
        if (n <= t.getNumber()) {
           if (t.getLeftSon() == null) {
              t.setLeftSon(new Node(n));
              return;
            }
           else
              addNode(n, t.getLeftSon());
        }
        else
             if (t.getRightSon() == null) {
                 t.setRightSon(new Node(n)); 
                 return;
                }
             else
                 addNode(n, t.getRightSon());
      }
    }
    
    
    public void postO() {
       postOrder(this.root);
    }
   
     private void postOrder(Node t) {
        intNode l = new intNode(Integer.MIN_VALUE, null);
        if (t == null)
          return;
        if (t.getRightSon() == null && t.getLeftSon() == null)
            System.out.print(t.getNumber() + ",");
        else {
            postOrder(t.getLeftSon());
            postOrder(t.getRightSon());
            System.out.print(t.getNumber() + ",");
        }
    }
    
    
    public void preO() {
       preOrder(this.root);
    }
    
    
    public void preOrder(Node t) {
        if (t == null)
          return;
        if (t.getRightSon() == null && t.getLeftSon() == null) {
            System.out.print(t.getNumber() + ",");
        }
        
        else {
            System.out.print(t.getNumber() + ",");
            preOrder(t.getLeftSon());
            preOrder(t.getRightSon());
        }
    }
     
    public void inO() {
       inOrder(this.root);
    }
    
    public void inOrder(Node t) {
        if (t == null)
          return;
        if (t.getRightSon() == null && t.getLeftSon() == null) {
            System.out.print(t.getNumber() + ",");
        }
        else {
            inOrder(t.getLeftSon());
            System.out.print(t.getNumber() + ",");
            inOrder(t.getRightSon());
        }
    }
    
    public void levelO() {
       levelOrder(this.root);
    }
    
    public void levelOrder(Node t) {
        Node y = t;
        queue_array que = new queue_array(20);
        que.enqueue(t);
        while (!que.isEmpty()) {
            y = que.denqueue(); 
            System.out.print(y.getNumber() + ",");
            if (y.getLeftSon() != null)
                que.enqueue(y.getLeftSon());
            if (y.getRightSon() != null)
                que.enqueue(y.getRightSon());
        }
    }
    
    private int counterLevel(Node t) {
        int counter = 0;
        if (t == null) 
           return 0;
        else {
            
        if (t.getRightSon() != null)
          counter++;
        if (t.getLeftSon() != null)
           counter++;
        }
        return counter;
    }
    
    
    public int widthLevel() {
        Node y = this.root;
        queue_array que = new queue_array(20);
        que.enqueue(y);
        int counter = 1;
        int temp = 1;
        int result = 1;
        while (!que.isEmpty()) {
            temp = counter;
            counter = 0;
            for (int i = 1; i <= temp; i++) {
                y = que.denqueue();
                // System.out.println(y);
                // System.out.println("counter-1:" + counter + ",");
                // System.out.println("temp0:" + temp + ",");
                 if (y.getLeftSon() != null) {
                   que.enqueue(y.getLeftSon());
                   counter++;
                }
                if (y.getRightSon() != null) {
                   que.enqueue(y.getRightSon());
                   counter++;
                }
            }
            if (counter > result)
                result = counter;
        }
        return result;
    }
    
    public int largeLevel() {
        Node y = this.root;
        queue_array que = new queue_array(20);
        que.enqueue(y);
        int max = 0;
        int counter = 1;
        int temp = 1;
        int result = this.root.getNumber();
        while (!que.isEmpty()) {
            max = 0;
            temp = counter;
            counter = 0;
            for (int i = 1; i <= temp; i++) {
                y = que.denqueue();
                max += y.getNumber();
                // System.out.println(y);
                // System.out.println("counter-1:" + counter + ",");
                // System.out.println("temp0:" + temp + ",");
                 if (y.getLeftSon() != null) {
                   que.enqueue(y.getLeftSon());
                   counter++;
                }
                if (y.getRightSon() != null) {
                   que.enqueue(y.getRightSon());
                   counter++;
                }
            }
            if (max > result)
                result = max;
        }
        return result;
    }
    
    public void pushLeftSide(Node t) {
        while (t.getLeftSon() != null) {
            t = t.getLeftSon();   
            this.sta.push(t);
        }
    }
    
    public void newInO() {
       newInorder(this.root);
    }
    
    public void newInorder(Node t) {
        this.sta.push(t);
        Node a;
        while (!this.sta.isEmpty()) {
           a = this.sta.pop();
           this.sta.push(a);
           pushLeftSide(a);
           a = this.sta.pop(); 
           System.out.print(a.getNumber() + ",");
           while (!this.sta.isEmpty() && a.getRightSon() == null) {
              a = this.sta.pop();
              System.out.print(a.getNumber() + ",");
           }
           if (a.getRightSon() != null)
                this.sta.push(a.getRightSon());
        }
    }
    
    public void mirrorT() {
       mirrorTree(this.root);
    }
    
    public void mirrorTree(Node n) {
        Node t = n;
        Node temp;
        if (t == null || t.getRightSon() == null && t.getLeftSon() == null)
            return;
        if (t.getLeftSon() == null) {
           t.setLeftSon(t.getRightSon());
           t.setRightSon(null);
           mirrorTree(t.getRightSon());
        }
        if (t.getRightSon() == null) {
           t.setRightSon(t.getLeftSon());
           t.setLeftSon(null);
           mirrorTree(t.getRightSon());
        }
        else {
            temp = t.getLeftSon();
            t.setLeftSon(t.getRightSon());
            t.setRightSon(temp);
            mirrorTree(t.getLeftSon());
            mirrorTree(t.getRightSon());
        }
    }
    
    
}