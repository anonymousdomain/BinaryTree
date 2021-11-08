/**
 * BSTest
 */
public class BSTest {

  public static void main(String[] args) {
    BST bst = new BST();
    bst.insert(10);
    bst.insert(20);
    bst.insert(15);
    bst.insert(6);
    bst.insert(12);
    bst.visit(bst.root);
    System.out.println("search");
    System.out.println(bst.search(bst.root, 20).data);
    System.out.println("bfs traversal");
    bst.bfs();
    System.out.println("dfs");
    bst.dfs();
  }
}
