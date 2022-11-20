package Cars;

public abstract class Car {
    protected final String brand;
    protected final String model;
    protected final int year;
    protected final String country;

    protected String color;
    protected Integer maxSpeed;
    protected float engineVolume;


    public Car(String brand, String model, int year, String country, String color, Integer maxSpeed, float engineVolume) {
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.brand = brand;

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (color == null || color == "") {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        this.country = country;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;

    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setColor(String color) {
        if (!color.isEmpty() || color == null) {
            this.color = "Red";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(Integer maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }


    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void startToMove() {
    }

    ;

    public void stopMoveing() {
    }



    @java.lang.Override
    public java.lang.String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public void checkDiagnostics()  {};
}
