public class AVLTreeTest {
  
    public static void main(String[] args) {
        AVLTree avl=new AVLTree();
       avl.root= avl.insert(avl.root, 10);
       avl.root= avl.insert(avl.root, 20);
       avl.root= avl.insert(avl.root, 30);
       avl.root= avl.insert(avl.root, 40);
       avl.root= avl.insert(avl.root, 50);
       avl.root= avl.insert(avl.root, 60);
        avl.preorder(avl.root);
    }
}
