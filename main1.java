
public class main1 {
    public static void main(String[] args) {
            //Task 1 testing
       PatientList patientList = new PatientList();


      System.out.println("Adding 5 patients to the test list.");

        patientList.addPatient(new Patient(101, "Ece Yilmaz", 3, 25));
        patientList.addPatient(new Patient(102, "Ayse Demir", 7, 40));
        patientList.addPatient(new Patient(103, "Mehmet Özer", 1, 30));
        patientList.addPatient(new Patient(104, "Naz Tekin", 9, 65)); // Severe case
        patientList.addPatient(new Patient(105, "John Cena", 5, 22));

        patientList.printList(); 

        System.out.println("Removing by id 102");
        Patient patientremoved = patientList.removePatient(102);
        if(patientremoved != null){
            System.out.println("Removed Patient: " + patientremoved);
        } else {
            System.out.println("Patient with ID 102 not found.");
        }

        //Search for a patient with id 104
        System.out.println("Searching patient with id 104");
        Patient found = patientList.findPatient(104);
        if(found != null){
            System.out.println("Found Patient: " + found);
        } else {
            System.out.println("Patient with ID 104 not found.");
            {
            }
        }

        System.out.println("Final Patient List:");
        patientList.printList();
        

        // Task 2 testing
        System.out.println("Treatment Queue Testing:");
        TreatmentQueue queue = new TreatmentQueue();
        // Adding 8 treatment requests
        System.out.println("Enqueuing 8 treatment requests.");
        for (int i = 1; i <= 8; i++) {
            int pid = 200 + i;
            System.out.println("Adding Patient ID: " + pid);
            queue.enqueue(new TreatmentRequest(pid, System.currentTimeMillis(),false)); 
        }
        System.out.println("Queue size:" + queue.size());
        queue.printQueue();

        // Dequeueing 3 treatment requests
        System.out.println("Dequeuing 3 treatment requests.");
        for (int i = 0; i < 3; i++) {
            TreatmentRequest tr = queue.dequeue();
            if (tr != null) {
                System.out.println("Dequeued: " + tr);
            } else {
                System.out.println("The treatment queue is empty.");
            }
        }
        //print final queue state
        System.out.println("Final Queue State:");
        queue.printQueue();
        System.out.println("Final Queue Size: " + queue.size());


        //Task 3 testing
        System.out.println("Task 3 testing");
        DischargeStack stack = new DischargeStack();
        // Pushing 5 discharged patients
        System.out.println("Pushing 5 discharged patients onto the stack.");
        for (int i = 1; i <= 5; i++) {
            int pid = 300 + i;
            System.out.println("Discharging Patient ID: " + pid);
            stack.push(new DischargeRecord(pid, i));
        }


        stack.printStack();

        //Popping 2 discharged patients
        System.out.println("Popping 2 discharged patients from the stack.");
        for (int i = 0; i < 2; i++) {
            DischargeRecord dr = stack.pop();
            if (dr != null) {
                System.out.println("Popped: " + dr);
            } else {
                System.out.println("The discharge stack is empty.");
            }
        }

        //print final stack state
        System.out.println("Final Stack State:");
        stack.printStack();
        

        


        

       


}
    }