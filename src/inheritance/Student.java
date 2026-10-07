package inheritance;

public class Student extends Person {
   private String studentId;
    Student(){
        studentId = "C112160";
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
