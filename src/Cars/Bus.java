package Cars;

public final class Bus extends Cars.Car {

    private String seats;

    private enum SeatNumbers {

        VERY_SMALL("До 10 мест"),
        SMALL("До 25 мест"),
        MIDDLE("До 40-50 мест"),
        LARGE("60-80 мест"),
        ENORMOUS("120-150 мест");

        private final String seatNumbers;

        SeatNumbers(String seatNumbers) {
            this.seatNumbers = seatNumbers;
        }

        public static String identifyNumbers(String seatNumbers) {

            for (SeatNumbers seat : SeatNumbers.values()) {
                if (seat.getSeatNumbers().equals(seatNumbers)) {
                    return seat.getSeatNumbers();
                }
            }
            System.out.println("Данных по автобусу недостаточно");
            String s = "Unknown";
            return s;
        }

        public String getSeatNumbers() {
            return seatNumbers;
        }
    }

    public Bus(String brand, String model, int year, String country, String color, Integer maxSpeed, float engineVolume, String seats) {
        super(brand, model, year, country, color, maxSpeed, engineVolume);
        this.seats=SeatNumbers.identifyNumbers(seats);


    }

    @Override
    public String toString() {
        return "Cars.Bus{" +
                "seats='" + seats + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engineVolume=" + engineVolume +
                '}';
    }
    @Override

    public void checkDiagnostics(){
        throw new UnsupportedOperationException("Автобусы не проходят диагностику");
    }
}