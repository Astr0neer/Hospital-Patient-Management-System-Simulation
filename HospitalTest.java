public class HospitalTest {
    public static void main(String[] args) {
        System.out.println("Hospital System Testing:"); // Testing the final task
        HospitalSystem hospital = new HospitalSystem();

        // Adding 10 patients
        System.out.println("Adding 10 patients to the system:");
        hospital.addNewPatient(101, "Natalie Portmen", 3, 30);
        hospital.addNewPatient(102, "Chris Hemsworth", 8, 45); //Priorty
        hospital.addNewPatient(103, "Peter Parker", 2, 25);
        hospital.addNewPatient(104, "Super Mario", 9, 70); // Critical
        hospital.addNewPatient(105, "Aleyna Tilki", 4, 35);
        hospital.addNewPatient(106, "Timothe Tchalamet", 7, 28);
        hospital.addNewPatient(107, "Sponge Bob", 1, 33);
        hospital.addNewPatient(108, "Kendall Jenner", 10, 30); // Very Critical
        hospital.addNewPatient(109, "Burak Yilmaz", 5, 36);
        hospital.addNewPatient(110, "Kim Kardashian", 6, 55);

        // Adding treatment requests
        System.out.println("\nAdding treatment requests:");
        hospital.addTreatmentRequest(101, false);
        hospital.addTreatmentRequest(103, false);
        hospital.addTreatmentRequest(105, false);
        hospital.addTreatmentRequest(107, false);
        hospital.addTreatmentRequest(109, false);

        // Adding urgent treatment requests
        hospital.addTreatmentRequest(102, true);
        hospital.addTreatmentRequest(104, true);
        hospital.addTreatmentRequest(108, true);        


        //Manually discharging 2 patients
        System.out.println("\n--- Step 3: Adding 2 Manual Discharge Records ---");
        hospital.dischargeStack.push(new DischargeRecord(998));
        hospital.dischargeStack.push(new DischargeRecord(999));
        System.out.println("Manual records added for ID 998 and 999.");

        // Process 4 requests
        System.out.println("\nProcessing 4 treatment requests:");
        hospital.processTreatment();
        hospital.processTreatment();
        hospital.processTreatment(); 
        hospital.processTreatment();



        // Step 5 Final Sytem State 
        System.out.println("\n--- Final System State ---");

        hospital.printAllPatients();
    }

    
}
