package Exceptions;

public class DuplicateIdException extends Exception{
    public DuplicateIdException(String message){
        System.out.println(message);
    }
}
