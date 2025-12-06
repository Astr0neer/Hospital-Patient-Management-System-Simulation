

public class TreatmentQueue {
    private Node front; // Pointer to the front of the queue
    private Node rear; // Pointer to the rear of the queue
    private int count;

    private class Node {
      TreatmentRequest data;
      Node next;

    public Node(TreatmentRequest request) {
          this.data = request;
          this.next = null;
      }
    }

    // Enqueue a new treatment request
    public void enqueue(TreatmentRequest request) {
        Node newNode = new Node(request);
        if (rear == null) {
            front = rear = newNode; 
        } else {
            rear.next = newNode; 
            rear = newNode; 
        }
        count++;
    }
    // Dequeue a treatment request
    public TreatmentRequest dequeue() {
        if (front == null) {
            return null; // Queue is empty
        }
        TreatmentRequest temp = front.data;
        front = front.next;

        if(front ==null){
            rear = null;
        }

        count--;
        return temp; // Return the dequeued request
    }
    //Get size
    public int size(){
      return count;
    }
    //print queue
    public void printQueue(){
      if( front == null){
        System.out.println("The treatment queue is empty.");
        return;
      }
      Node current = front;
      while(current != null){
        System.out.println();
        current = current.next;

      }
      System.out.println("-------------------");
    }
    



  
}
