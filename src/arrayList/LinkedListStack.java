package arrayList;

import linkedList.LLNode;

public class LinkedListStack<T> implements StackInterface<T> {

  protected LLNode<T> top;

  public LinkedListStack() {
    this.top = null;
  }

  public LinkedListStack(LLNode<T> node){
    this.top = node;
  }

  @Override
  public void push(T type) {
    LLNode<T> newNode = new LLNode<T>(type);
    newNode.setNext(this.top);
    top = newNode;
  }

  @Override
  public void pop() throws StackUnderflowException {
    if (isEmpty()){
      throw new StackUnderflowException("blah");
    } else {
      top = top.getNext();  // what????
    }
  }

  @Override
  public T top() throws StackUnderflowException {
    if (isEmpty()){
      throw new StackUnderflowException("blah");
    } else {
      return this.top.getData();
    }
  }

  @Override
  public boolean isEmpty() {
    if (this.top == null){

    }
    return false;
  }

  @Override
  public boolean isFull() {
    return false;
  }
}
