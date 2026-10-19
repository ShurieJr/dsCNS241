package Activity1;

public class SeniorNetTech extends NetworkTechnician {
    private int yearsOfExperience;

    public SeniorNetTech() {
        yearsOfExperience = 5;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public SeniorNetTech(String name, String id, String department,
                         String specialization,
                         int yearsOfExperience) {
        super(name, id, department, specialization);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    void display() {
        super.display();
        System.out.println(yearsOfExperience);
    }
}
