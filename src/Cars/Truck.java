package Cars;


public final class Truck extends Cars.Car {
    private String capacity;



    public enum LoadCapacity {
        EASY ("<3,5"),
        MIDDLE ("3,5 - 12"),
        HARD(">12");

        private final String loadCapacity;

        LoadCapacity(String loadCapacity) {
            this.loadCapacity = loadCapacity;
        }


        public static String calculateCapacity(String loadCapacity){
            for (LoadCapacity capacity : LoadCapacity.values()) {
                if (capacity.getLoadCapacity().equals(loadCapacity)) {
                    return capacity.getLoadCapacity();
                }
            }
            System.out.println("Данных по авто недостаточно");
            String s="Unknown";
            return s;
        }

        public String getLoadCapacity() {
            return loadCapacity;
        }

    }




    public Truck(String brand, String model, int year, String country, String color, Integer maxSpeed, float engineVolume, String capacity) {
        super(brand, model, year, country, color, maxSpeed, engineVolume);
        this.capacity = LoadCapacity.calculateCapacity(capacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacity='" + capacity + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engineVolume=" + engineVolume +
                '}';
    };
    @Override
    public void checkDiagnostics(){
        System.out.println("Грузовик " + toString() + " диагностике не требуется");
    }

}
