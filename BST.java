public class BST {

  BSTNode root;
  AVLTree avl;

  public BST() {
    this.root=null;
    avl = new AVLTree();
  }

  public void visit(BSTNode p) {
    System.out.println(p.data + " ");
  }

  public BSTNode insert(BSTNode node, int e1) {
    if (node == null) return new BSTNode(e1);
    if (e1 < node.data) node.left = insert(node.left, e1); else if (
      e1 > node.data
    ) node.right = insert(node.right, e1);
     else return node;

   // update the node hieght
    node.height = avl.max(avl.height(node.left), avl.height(node.right)) + 1;

    //get balance factor
    int balanceFctor = avl.getBalanceFactor(node);

    if (balanceFctor > 1 && e1 < node.left.data) {
      return avl.rightRotation(node);
    }
    //left right rotation
    if (balanceFctor > 1 && e1 > node.left.data) {
      node.left = avl.leftRotation(node.left);
      return avl.rightRotation(node);
    }

    if(balanceFctor<-1 && e1>node.right.data){
      return avl.leftRotation(node);
    }
    if(balanceFctor<-1 && e1<node.right.data){
      node.right=avl.rightRotation(node.right);
      return avl.leftRotation(node);
    }
    return node;
  }

  //this only works if the binary tree is sorted tree
  public BSTNode search(BSTNode p, int e1) {
    while (p != null) {
      if (p.data == e1) return p; else if (e1 < p.data) p = p.left;
      p = p.right;
    }
    return null;
  }

  //using queue datastracture
  public void bfs() {
    BSTNode node = this.root;
    LLQueue queue = new LLQueue();
    if (node != null) {
      queue.enqueue(node);
      while (!queue.isEmpty()) {
        node = queue.dequeue();
        visit(node);
        if (node.left != null) queue.enqueue(node.left);
        if (node.right != null) queue.enqueue(node.right);
      }
    }
  }

  //using stack datastracture
  public void dfs() {
    BSTNode node = this.root;
    Stack st = new Stack();
    if (node != null) {
      st.push(node);

      while (!st.isEmpty()) {
        node = st.pop();
        visit(node);
        if (node.right != null) st.push(node.right);
        if (node.left != null) st.push(node.left);
      }
    }
  }

  // dfs traversal preorder postorde inorder

  public void preorder(BSTNode node) {
    if (node != null) {
      visit(node);
      preorder(node.left);
      preorder(node.right);
    }
  }

  public void inorder(BSTNode node) {
    if (node != null) {
      inorder(node.left);
      visit(node);
      inorder(node.right);
    }
  }

  public void postorder(BSTNode node) {
    if (node != null) {
      postorder(node.left);
      postorder(node.right);
      visit(node);
    }
  }

  public int BinaryTreeSum(BSTNode node) {
    if (node == null) return 0;
    int leftsum = BinaryTreeSum(node.left);
    int rightSum = BinaryTreeSum(node.right);
    return node.data + leftsum + rightSum;
  }
}
