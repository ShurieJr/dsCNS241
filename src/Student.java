public class Student {
    //data fields
    String name;
    String ID;
    String tel;
    String faculty;
//    constructors
    Student(){    // no-arg constructor
        name= "Mohamed Abdullahi";
        ID = "C112160";
        tel = "+2526152948";
        faculty= "Computer Application";
    }
    Student(String name , String ID ,
            String tel , String faculty){
        this.name =  name;
        this.ID = ID;
        this.tel = tel;
        this.faculty = faculty;
    }
//    methods
    void displayInfo(){
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Faculty: " + faculty);
        System.out.println("Tel: " + tel);
    }
}
