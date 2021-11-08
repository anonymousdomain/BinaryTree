/**
 * BSTNode
 */
public class BSTNode {

  int data;
  BSTNode left, right;

  public BSTNode() {
    this.left = this.right = null;
  }

  public BSTNode(int data) {
    this(data, null, null);
  }

  public BSTNode(int data, BSTNode left, BSTNode right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
}
