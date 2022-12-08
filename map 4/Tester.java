public class Tester
{
    public static void inorder(Node t)
    {
        if (t == null)
            return;
        if (t.getLeftSon() != null)
            inorder(t.getLeftSon());
        System.out.print(t.getNumber()+" ");
        if (t.getRightSon() != null)
            inorder(t.getRightSon());
    }
    
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
  
        // create root
        tree.root = new Node(1);
  
        /* following is the tree after above statement
  
              1
            /   \
          null  null     */
  
        tree.root.setLeftSon(new Node(2));
        tree.root.setRightSon(new Node(3));
  
        /* 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */
  
        tree.root.getLeftSon().setLeftSon(new Node(4));
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
        inorder(tree.root);
    }
}
        