/**
 * BSTNode
 */
public class BSTNode {

  Object data;
  BSTNode left, right;

  public BSTNode() {
    this.left = this.right = null;
  }

  public BSTNode(Object data) {
    this(data, null, null);
  }

  public BSTNode(Object data, BSTNode left, BSTNode right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
}
