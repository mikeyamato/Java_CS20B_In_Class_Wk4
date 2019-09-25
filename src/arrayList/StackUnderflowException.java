package arrayList;

public class StackUnderflowException extends RuntimeException {
  public StackUnderflowException(){
    super();
  }
  public StackUnderflowException(String theStackIsEmpty) {
  }
}
