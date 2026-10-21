package Exceptions;

import java.util.Scanner;

public class Main {
    static void main() throws DuplicateIdException {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        String[] names = {"ali" , "ahmed" , "Hawa"};
        String name = null;
        String[] id = new String[2];

        System.out.println("Enter id 1 : ");
        id[0]= input.next();
        System.out.println("Enter id 2 : ");
        id[1]= input.next();

        //unchecked exceptions = runtime exceptions
//        try {
//            System.out.println(names[0]);
//            //System.out.println(a  + " / " + b + " = " + a/b);
//            System.out.println(name.length());
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("array out of bound exception!");
//        }
//        catch(ArithmeticException e){
//            System.out.println("/ by zero exception!");
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//

        if (id[0].equals(id[1])){
            throw new DuplicateIdException("duplicate id exception!");
        }



        System.out.println("end of the program");

    }
}
