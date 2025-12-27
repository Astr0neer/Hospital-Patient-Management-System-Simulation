import java.util.HashMap;






public class HospitalSystem{




    // attributes
    PatientList patientList;
    TreatmentQueue normalQueue;
    TreatmentQueue urgentQueue; 
    DischargeStack dischargeStack;
    HashMap<Integer, Patient> patientMap; //To store the patients in a HashMap, for quick lookup

    //constructor
    public HospitalSystem(){
        this.patientList = new PatientList();
        this.normalQueue = new TreatmentQueue();
        this.urgentQueue = new TreatmentQueue();
        this.dischargeStack = new DischargeStack();
        this.patientMap = new HashMap<>();
    }


    // adding a new patient 
    public void addNewPatient(int id, String name, int severity, int age){
        Patient newPatient = new Patient(id, name, severity, age);
        patientList.addPatient(newPatient);
        patientMap.put(id, newPatient); // Keep in map for fast reference ratio
        System.out.println("Registered: " + name + " (ID: " + id + ", Severity: " + severity + ")");


    }


    // Adding treatment request for the hospital system
    public void addTreatmentRequest(int patientId, boolean isPriority){
        if (!patientMap.containsKey(patientId)){
            System.out.println("Error: Patient ID " + patientId + " not found!");
            return;


        }

        TreatmentRequest request = new TreatmentRequest(patientId, System.currentTimeMillis(), isPriority);
        
        if (isPriority){
            urgentQueue.enqueue(request);
            System.out.println("URGENT request added for ID: " + patientId);
        } else{
            normalQueue.enqueue(request);
            System.out.println("Normal request added for ID: " + patientId);
        }
    }

    //Treatment process method for project***
    public void processTreatment(){
        TreatmentRequest requestToProcess = null;

        // ***priority to the urgent queue first***
        if(urgentQueue.size() > 0){
            requestToProcess = urgentQueue.dequeue();
        } else if(normalQueue.size() > 0){
            requestToProcess = normalQueue.dequeue();
        }
        

        if (requestToProcess != null){
            // Create and push discharge record
            DischargeRecord discharge = new DischargeRecord(requestToProcess.patientId, System.currentTimeMillis());
            dischargeStack.push(discharge);
            
            // Display processed treatment
            String name = patientMap.get(requestToProcess.patientId).name;
            System.out.println("Processed Treatment for: "+name +" (ID: "+requestToProcess.patientId +")");
        } else{
            System.out.println("***No treatment requests waiting***.");
        }

    }


    // Print all patients
    public void printAllPatients(){
        System.out.println("*** Patient List ***");
        
        // Sort patients by severity before printing
        System.out.println("***Sorting patients by severity...");
        patientList.sortBySeverity();
        patientList.printList();

        System.out.println("***Waiting Treatment Queue (Urgent):");
        System.out.print("***Urgent Queue: "); urgentQueue.printQueue();
        System.out.print("***Normal Queue: "); normalQueue.printQueue();

        System.out.println("***Discharged Patients Stack:");
        dischargeStack.printStack();
        System.out.println("***====================****");
        System.out.println("****");






    }




}

