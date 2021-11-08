/**
 * BST
 */
public class BST {

  BSTNode root;

  public BST() {
    this.root = null;
  }

  public void visit(BSTNode p) {
    System.out.println(p.data + " ");
  }

  public void insert(int e1) {
    BSTNode p = root, prev = null;

    while (p != null) {
      prev = p;
      if (p.data < e1) p = p.right; else p = p.left;
    }
    if (root == null) root = new BSTNode(e1); else if (
      prev.data < e1
    ) prev.right = new BSTNode(e1); else prev.left = new BSTNode(e1);
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
        node=st.pop();
        visit(node);
        if(node.right!=null)st.push(node.right);
        if(node.left!=null)st.push(node.left);
      }
    }
  }
}
