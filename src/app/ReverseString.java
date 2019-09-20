package app;

import arrayList.*;

public class ReverseString {
  public static void main (String[] args) throws StackOverflowException, StackUnderflowException {
    String word = "hello";
    StackInterface<Character> stack = new ArrayListStack<Character>();
    for (int i = 0; i < word.length(); i++){
      stack.push(Character.valueOf(word.charAt(i)));
    }
    while(!stack.isEmpty()){
      Character ch = stack.top();
      System.out.print(ch);
      stack.pop();
    }
    System.out.println(stack);
  }
}
