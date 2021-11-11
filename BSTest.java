
public class BSTest {

  public static void main(String[] args) {
    BST bst = new BST();
    bst.insert(bst.root,30);
    bst.insert(bst.root,10);
    bst.insert(bst.root,11);
    bst.insert(bst.root,1);
    bst.insert(bst.root,-2);
    //bst.visit(bst.root);
    System.out.println("search");
   // System.out.println(bst.search(bst.root, 11).data);
    System.out.println("bfs traversal");
    bst.bfs();
    System.out.println("dfs");
    bst.dfs();
    System.out.println("preorder");
    bst.preorder(bst.root);
    System.out.println("inorder");
    bst.inorder(bst.root);
    System.out.println("postorder");
    bst.postorder(bst.root);
    System.out.println(bst.BinaryTreeSum(bst.root));
  }
}
