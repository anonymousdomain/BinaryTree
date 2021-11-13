public class AVLTree {
BSTNode root;

  int height(BSTNode node) {
    if (node == null) return 0;
    return node.height;
  }

  int max(int a, int b) {
    return (a > b) ? a : b;
  }

  BSTNode rightRotation(BSTNode y) {
    BSTNode x = y.left;
    BSTNode subnode = x.right;
    //rotation
    x.right = y;
    y.left = subnode;
    //update the root ;
    y.height = max(height(y.left), height(y.right)) + 1;
    x.height = max(height(x.left), height(x.right)) + 1;

    //rotated node
    return x;
  }

  BSTNode leftRotation(BSTNode x) {
    BSTNode y = x.right;
    BSTNode subnode = y.left;

    //roatate to left
    x.right = subnode;
    y.left = x;

    return y;
  }

  int getBalanceFactor(BSTNode node) {
    if (node == null) return 0;
    return height(node.left) - height(node.right);
  }
  public BSTNode insert(BSTNode node, int e1) {
    if (node == null) return new BSTNode(e1);
    if (e1 < node.data) node.left = insert(node.left, e1); else if (
      e1 > node.data
    ) node.right = insert(node.right, e1);
     else return node;

   // update the node hieght
    node.height = max(height(node.left),height(node.right)) + 1;

    //get balance factor
    int balanceFctor = getBalanceFactor(node);

    if (balanceFctor > 1 && e1 < node.left.data) {
      return rightRotation(node);
    }
    //left right rotation
    if (balanceFctor > 1 && e1 > node.left.data) {
      node.left = leftRotation(node.left);
      return rightRotation(node);
    }

    if(balanceFctor<-1 && e1>node.right.data){
      return leftRotation(node);
    }
    if(balanceFctor<-1 && e1<node.right.data){
      node.right=rightRotation(node.right);
      return leftRotation(node);
    }
    return node;
  }
}
