
public class Patient {

    int id;
    String name;
    int severity;
    int age;

    // Constructor
    Patient(int id, String name, int severity, int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", severity=" + severity +
                ", age=" + age +
                '}';
    }
        

    
}
