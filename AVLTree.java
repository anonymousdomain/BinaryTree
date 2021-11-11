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
    x.right=subnode;
    y.left=x;

    return y;
  }
  int getBalanceFactor(BSTNode node){
      if(node==null)return 0;
      return height(node.left)-height(node.right);
  }
  
}
