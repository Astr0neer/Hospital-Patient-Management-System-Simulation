public class DischargeRecord {
  int patientId;
  long dischargeTime;

  public DischargeRecord(int patientId, long dischargeTime) {
    this.patientId = patientId;
    this.dischargeTime = dischargeTime;
  }
  // toString method to display the discharge record details
  @Override
  public String toString() {
    return "DischargeRecord{" +
           "patientId=" + patientId +
           ", dischargeTime=" + dischargeTime +
           '}';
  }
  



}
