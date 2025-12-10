public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean isPriority;

    public TreatmentRequest(int patientId, long arrivalTime, boolean isPriority) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
        this.isPriority = isPriority;
    }
    // toString method to display the request details
    @Override
    public String toString() {

        String status = isPriority ? "[EMERGENCY]" : "[Normal]";
        return "Request " + status + " [ID: " + patientId + ", Time: " + arrivalTime + "]"; 
    }

    

  
}
