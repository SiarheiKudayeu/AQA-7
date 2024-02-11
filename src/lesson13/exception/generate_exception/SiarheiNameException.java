package lesson13.exception.generate_exception;

public class SiarheiNameException extends Exception{
    @Override
    public String getMessage(){
        return "Don't input name Siarhei";
    }
}
