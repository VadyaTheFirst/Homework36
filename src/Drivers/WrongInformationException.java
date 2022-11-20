package Drivers;


import Cars.Car;

public class WrongInformationException extends Exception{
   private CarDriver driver;

    public WrongInformationException(String message, CarDriver driver) {
        super(message +driver.getFIO()+ " Ввел неверные данные" );
        this.driver= (CarDriver) driver;
    }

    public CarDriver getDriver() {
        return driver;
    }
}
