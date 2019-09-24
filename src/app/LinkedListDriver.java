package app;

import arrayList.LinkedListStack;
import arrayList.StackInterface;
import linkedList.LLNode;

public class LinkedListDriver {
  public static void main(String[] args) {
    StackInterface<String> llstack = new LinkedListStack<String>();
    llstack.push("A");
    llstack.push("B");
    llstack.push("C");

    System.out.println(llstack.top());
    llstack.pop();
    System.out.println(llstack.top());
    llstack.pop();
    System.out.println(llstack.top());

    // create LLNode with some letters
    LLNode<String> node1 = new LLNode<String>("Mike, ");
    LLNode<String> node2 = new LLNode<String>("Donovan, ");
    LLNode<String> node3 = new LLNode<String>("Grace, ");

//    System.out.println(node1);
//    System.out.println(node2);
//    System.out.println(node3);

    node1.setNext(node2);
    node2.setNext(node3);

    LLNode<String> tmp = node1;  // tmp = temporary

    while(tmp != null){
      System.out.print(tmp);
      tmp = tmp.getNext();
    }
  }
}
