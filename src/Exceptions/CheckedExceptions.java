package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
    static void main() {
        try {
            readFile();
            System.out.println("file reading.....");
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception");
        }
        finally {
            System.out.println("file reader end!");
        }
    }

   static void readFile() throws FileNotFoundException {
        FileReader f = new FileReader("src/Exceptions/data2.txt");
    }
}
