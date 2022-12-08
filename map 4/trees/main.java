public class main {
    public static void main(String[] args) {
    
    
    BinaryTree tree = new BinaryTree(10);
    tree.addN(1);
    tree.addN(11);
    tree.addN(5);
    tree.addN(17);
    tree.addN(3);
    tree.addN(19);
    tree.addN(6);
    tree.addN(14);
    tree.addN(4);
    tree.addN(12);
    tree.addN(8);
    tree.addN(16);
    
    
    
    System.out.println();
    tree.levelO();
    // System.out.println();
    // tree.preO();
    System.out.println();
    tree.mirrorT();
    System.out.println();
    tree.preO();
    System.out.println();
    tree.levelO();
    
    // tree.postO();
    
    
    // tree.inO();
    // System.out.println();
    // System.out.println();
    
    
    // System.out.println(tree.largeLevel());
    // System.out.println(tree.widthLevel());
}
}