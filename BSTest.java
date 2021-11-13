
public class BSTest {

  public static void main(String[] args) {
    BST bst = new BST();
  bst.insert(10);
  bst.insert(20);
  bst.insert(30);
  bst.insert(40);
  bst.insert(50);
  
    System.out.println("search");
   System.out.println(bst.search(bst.root,10).data);
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
    System.out.println("binary tree sum");
    System.out.println(bst.BinaryTreeSum(bst.root));
  }
}
