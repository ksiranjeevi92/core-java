package ecceptionhandling.customexception;

public class UncheckedCustomException extends RuntimeException{

    UncheckedCustomException(String message){
        super(message);
    }

}
