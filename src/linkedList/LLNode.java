package linkedList;

// have generic information
// it's a class and not interface because this will hold actual data
public class LLNode <T> {
  protected T data;
  protected LLNode<T> next;

  public LLNode(T data){
    this.data = data;
    this.next = null;
  }

  // set the next node to node
  public void setNext(LLNode<T> node){
    this.next = node;
  }

  public LLNode<T> getNext(){
    return this.next;
  }

  public T getData(){
    return this.data;
  }

  public String toString(){
    return this.data.toString();
  }


}
