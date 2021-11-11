/**
 * BSTNode
 */
public class BSTNode {

  int data ,height;
  BSTNode left, right;

  public BSTNode() {
    this.left = this.right = null;
  }

  public BSTNode(int data ) {
    this(data, null, null);
    this.height=1;
  }

  public BSTNode(int data, BSTNode left, BSTNode right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
  
}
