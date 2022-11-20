package Cars;
import Cars.*;


public final class LightWeight extends Cars.Car {
    private String body;




    public enum BodyType {
        SEDAN("Седан"),//объект с параметром
        COUPE("Купе"),
        CROSSOVER("Паркетник"),
        OFFROAD("Внедорожник"),
        UNIVERSAL("Универсал");

        private final String bodyType;
        public static String identifyBody(String bodyType) {

            for (BodyType body : BodyType.values()) {
                if (body.getBodyType().equals(bodyType)) {
                    return body.getBodyType();
                }
            }
            System.out.println("Данных по авто недостаточно");
            String s="Unknown";
            return s;
        }






        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "BodyType{" +
                    "bodyType='" + bodyType + '\'' +
                    '}';


        }
    }











    public LightWeight(String brand, String model, int year, String country, String color, Integer maxSpeed, float engineVolume, String body) {
        super(brand, model, year, country, color, maxSpeed, engineVolume);
        this.body=BodyType.identifyBody(body);
    }



    //   public void identify(String body){
    //    BodyType bodytype = BodyType.valueOf(body);
    //   System.out.println(bodytype);


    @Override
    public String toString() {
        return "LightWeight{" +
                "body='" + body + '\'' +
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

    public void  checkDiagnostics(){
        System.out.println("Легковушка " + toString() + " диагностике не требуется");

    }

}