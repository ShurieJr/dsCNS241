package StacksDemo;

public class test <T , E>  {  //generic class
   T data;
   E data2;

   int age;

   public T getData() {
      return data;
   }

   public void setData(T data) {
      this.data = data;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   static void main() {
      test<String , String> ob1 = new test<>();
      test<Integer , String> ob2 = new test<>();
      test<Character , Integer> ob3 = new test<>();
      test<Boolean , Boolean> ob4 = new test<>();

      test<Double , Character> ob5 = new test<>();

      ob1.data = "Ali";
      ob2.data = 23;
      ob3.data = 'A';
      ob4.data = true;

      ob5.data = 3.0;
      ob5.data2 = 'A';
   }
}
