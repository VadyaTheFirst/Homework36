package Drivers;
import Cars.Car;


import java.sql.Driver;


public class CarLicense < T extends Car > {
    private final CarDriver driver;
    private String licenceType;

    public CarLicense(CarDriver driver, String licenceType) throws WrongInformationException {
        this.driver = driver;
        checkLicense(licenceType);
    }

    public void drives(T car) {
        if (!driver.getHasDriverLicense()) {
            System.out.println("У этого водителя нет прав");
        } else {
            System.out.println(driver.getFIO() + " с лицензией " + licenceType + " " + car.getBrand());
        }
    }

    public void checkLicense(String licenceType) throws WrongInformationException {

            if (licenceType != null) {
                this.licenceType = licenceType;
            } else {
            throw new WrongInformationException("Налл!!");
        }
    }
}
