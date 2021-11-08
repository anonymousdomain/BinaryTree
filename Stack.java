class Stack {

  LinkedList ls = new LinkedList();

  public void push(BSTNode e1) {
    ls.addToTail(e1);
  }

  public void pop() {
    ls.removeFromTail();
  }
}
