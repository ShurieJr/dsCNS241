public class Student {
    //data fields
    private String name;
    private String ID;
    private String tel;
    private String faculty;

    //    constructors
    Student() {    // no-arg constructor
        name = "Mohamed Abdullahi";
        ID = "C112160";
        tel = "+2526152948";
        faculty = "Computer Application";
    }

    Student(String name, String ID,
            String tel, String faculty) {
        this.name = name;
        this.ID = ID;
        this.tel = tel;
        this.faculty = faculty;
    }

    //getters
    public String getName() {
        return name;
    }

    //setters
    public void setName(String newName) {
        if (newName.length() >= 3)
            name = newName;
        else
            System.out.println("name must be at least 3 chars");
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    //    methods
    void displayInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Faculty: " + faculty);
        System.out.println("Tel: " + tel);
    }
}
