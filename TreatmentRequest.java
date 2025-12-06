public class TreatmentRequest {
    int patientId;
    long arrivalTime;

    public TreatmentRequest(int patientId, long arrivalTime) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
    }
    // toString method to display the request details
    @Override
    public String toString() {
        return "TreatmentRequest{" +
                "patientId=" + patientId +
                ", arrivalTime=" + arrivalTime +
                '}';
    }

    

  
}
