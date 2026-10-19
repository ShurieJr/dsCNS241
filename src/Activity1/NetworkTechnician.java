package Activity1;

public class NetworkTechnician extends Employee{
    private  String specialization;

    public NetworkTechnician() {
        this.specialization = "TroubleShooting";
    }

    public NetworkTechnician(String name, String id, String department, String specialization) {
        super(name, id, department);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    void display() {
        super.display();
        System.out.println(specialization);
    }
}
