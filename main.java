
public class main {
    public static void main(String[] args) {
            //Task 1 testing
      /*PatientList patientList = new PatientList();


      System.out.println("Adding 5 patients to the test list.");

        patientList.addPatient(new Patient(101, "Ece Yilmaz", 3, 25));
        patientList.addPatient(new Patient(102, "Ayse Demir", 7, 40));
        patientList.addPatient(new Patient(103, "Mehmet Özer", 1, 30));
        patientList.addPatient(new Patient(104, "Naz Tekin", 9, 65)); // Severe case
        patientList.addPatient(new Patient(105, "John Cena", 5, 22));

        patientList.printList(); //" Print all patients in the list."

        System.out.println("Removing by id 102");
        Patient patientremoved = patientList.removPatient(102);
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
        */

        // Task 2 testing
        System.out.println("Treatment Queue Testing:");
        TreatmentQueue queue = new TreatmentQueue();
        // Adding 8 treatment requests
        System.out.println("Enqueuing 8 treatment requests.");
        for (int i = 1; i <= 8; i++) {
            int pid = 200 + i;
            System.out.println("Adding Patient ID: " + pid);
            queue.enqueue(new TreatmentRequest(pid, System.currentTimeMillis())); 
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


        

       


}
    }
