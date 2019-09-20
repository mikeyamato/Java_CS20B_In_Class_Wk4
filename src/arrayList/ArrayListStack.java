package arrayList;

import java.util.ArrayList;

public class ArrayListStack<T> implements StackInterface<T> {

  protected ArrayList<T> elements;

  public ArrayListStack(){
    this.elements = new java.util.ArrayList<T>();
  }

  @Override
  public void push(T el) {
    this.elements.add(el);
  }

  @Override
  public void pop() throws StackUnderflowException {
    if(!isEmpty()){
      // no return because i'm just removing
      this.elements.remove(this.elements.size()-1);
    } else {
      throw new StackUnderflowException ("The stack is empty");
    }
  }

  @Override
  public T top() throws StackUnderflowException{
    if(!isEmpty()){
      return this.elements.get(this.elements.size()-1);
    } else {
      throw new StackUnderflowException("The stack is empty");
    }
  }

  @Override
  public boolean isEmpty() {
    return this.elements.size() == 0;
  }

  @Override
  // will never be full
  public boolean isFull() {
    return false;
  }

  @Override
  public String toString(){
    return this.elements.toString();
  }
}
