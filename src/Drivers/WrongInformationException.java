package Drivers;

public class WrongInformationException extends Exception{

    public WrongInformationException(String message) {
        super(message + "Введены неверные данные");
    }
}
