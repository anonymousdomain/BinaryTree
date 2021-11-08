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
      if (p.data < e1) p = p.right;
      else  p = p.left;
    }
    if (root == null) root = new BSTNode();
    else if (prev.data < e1) prev.right = new BSTNode(e1); 
    else prev.left =new BSTNode(e1);
  }
  public BSTNode search(BSTNode p,int e1){
   while (p!=null) {
     if(p.data==e1)return p;
     else if(e1<p.data) p=p.left;
     p=p.right;
   }
   return null;
  }
}
