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
        // Empty for now
    }

    public Patient removPatient(){
        return null; // Empty for now
    }

    public Patient findPatient(int id){
        return null; // Empty for now
    }

    public void printList() {
    Node current = head;
    while (current != null) {
        System.out.println(current.patient); 
        current = current.next;
    }
}




    

    
}


