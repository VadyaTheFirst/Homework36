package Drivers;

public class CarDriver {

    private final String FIO;
    private boolean hasDriverLicense;
    private int workingExperience;

    public CarDriver(String FIO, boolean hasDriverLicense, int workingExperience) {
        this.FIO = FIO;
        this.hasDriverLicense = hasDriverLicense;
        this.workingExperience = workingExperience;
    }

    public String getFIO() {
        return FIO;
    }

    public boolean getHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(byte workingExperience) {
        this.workingExperience = workingExperience;
    }

    public void beginToMove(){
        System.out.println("Зажигание и вперед!");
    };
    public void stop(){
        System.out.println("Торможу");
    };

    public void refill(){
        System.out.println("Заправляю");
    }
}
