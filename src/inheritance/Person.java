package inheritance;

public class Person {
    private String name;
    private String tel;
    private int age;

    protected String address;

    public Person() {
        name = "Abdullahi ali";
        tel = "+888";
        age = 39;
        System.out.println("Person no-arg constructor");
    }

    public Person(String name, String tel, int age) {
        this.name = name;
        this.tel = tel;
        this.age = age;
        System.out.println("Person param constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     public void display() {
        System.out.println(name);
        System.out.println(tel);
        System.out.println(age);
    }


}
