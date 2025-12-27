public class DischargeStack {
  private Node top;


  // Inner node class in discharge stack
  private class Node {
    DischargeRecord data;
    Node next;

    Node(DischargeRecord data) {
      this.data = data;
      this.next = null;
    }
  }



  // Push method to add a discharge record to the stack
  public void push(DischargeRecord record){
    Node newNode = new Node(record);

    newNode.next = top;

    top = newNode;

  }

  // pop method to remove and return the top discharge record from the stack
  public DischargeRecord pop(){
    if(top ==null){
      return null; // Stack is empty
    }
    DischargeRecord poppedData = top.data;
    top = top.next;
    return poppedData;

    }

    // Peek method to view the top discharge record without removing it
    public DischargeRecord peek(){
      if(top == null){
        return null; // Stack is empty
      }
      return top.data;
    }

    //Print the stack
    public void printStack(){
      if(top ==null){
        System.out.println("Stack is empty!");
        return;
      }
      Node current = top;
      while(current != null){
        System.out.println(current.data);
        current = current.next;
      }
      System.out.println("----------------------------------");
    }


    // Check if the stack is empty or not
    public boolean isEmpty(){
      return top == null;
      
    }




    }

  




  
