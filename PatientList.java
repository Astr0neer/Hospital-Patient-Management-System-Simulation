public class PatientList {

    private Node head;


    class Node {
        Patient patient;
        Node next;
        // Constructor
        Node(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }


    public void addPatient(Patient p){
        Node newNode = new Node(p);
        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode; 
        }
    }

    public Patient removPatient(int id){
        if(head == null){
            return null;
        }
        if(head.patient.id == id){
            Patient removedPatient = head.patient; //Store the removed patient
            head = head.next;
            return removedPatient;
        }
        Node current = head;
        while(current.next !=null){
            if(current.next.patient.id == id){
                Patient removedPatient = current.next.patient;
                current.next = current.next.next; // Bypass the removed node
                return removedPatient;
            }
            current = current.next;
        }

        return null; // Patient not found
    }

    public Patient findPatient(int id){
        Node current = head;
        while(current !=null){
            if(current.patient.id ==id){
                return current.patient; // Patient found
            }
            current = current.next;
        }
        return null; // Patient not found
    }

    public void printList() {
    Node current = head;

    System.out.println("Patient List:");
    while (current != null) {
        System.out.println(current.patient); 
        current = current.next;
    }
    System.out.println("--------------------");
}



//Task 4

public void sortBySeverity(){
    if(head == null || head.next == null){
        return; // List is empty or has only one patient
    }
    boolean swapped;
    Node current;
    do {    
        swapped = false;
        current = head;
        while(current.next != null){
            if(current.patient.severity < current.next.patient.severity){
                // Swap patients
                Patient temp = current.patient;
                current.patient = current.next.patient;
                current.next.patient = temp;
                swapped = true;
            }
            current = current.next;
        }
    } while(swapped);   // Repeat until no swaps occur

}





    

    
}


