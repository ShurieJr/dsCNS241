package inheritance;

public class Student extends Person {
    private String studentId;

    Student() {
        studentId = "C112160";
        System.out.println("Student no-arg constructor");
    }

    public Student(String name, String tel, int age, String studentId) {
        this.studentId = studentId;
        super(name, tel, age);
        System.out.println("Student param constructor");
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void display(){
        System.out.println(studentId);
        super.display();
        System.out.println(super.address);
    }
}
