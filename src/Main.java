public class Main {
    static void main() {
//      Student student1 = new Student();
////      Student student2 = new Student("Warsame" ,"1234" , "+242343" ,"BA" );
////      System.out.println("id before update: " + student1.ID);
////      student1.ID = "C119000";
//      student1.displayInfo();

//network device
        NetworkDevice router1 = new NetworkDevice();
        router1.location = "server room";
        router1.connect();
        router1.display();
        router1.restart();
    }
}
