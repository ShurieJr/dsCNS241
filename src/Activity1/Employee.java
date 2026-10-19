package Activity1;

public class Employee {
    private String name , id , department;

    public Employee() {
        id = "EMP0001";
        name = "Abdirahman omar";
        department = "Security";
    }

    public Employee(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(department);
    }
}
