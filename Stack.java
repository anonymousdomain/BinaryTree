class Stack {

  LinkedList ls;
  public Stack(){
    this.ls=new LinkedList();
  }
  

  public void push(BSTNode e1) {
    this.ls.addToTail(e1);
  }

  public BSTNode pop() {
   return this.ls.removeFromTail();
  }

  public boolean isEmpty() {
    return ls.isEmpty();
  }
}
