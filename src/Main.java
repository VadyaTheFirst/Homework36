import Cars.Bus;
import Cars.LightWeight;
import Cars.Truck;
import Cars.Car;
import Drivers.*;


import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws WrongInformationException {


        Cars.LightWeight car = new LightWeight("Lada","kalina",2011,"rf","red",120,1.2f,"Купе");
        System.out.println(car.toString());

        Cars.Bus bus = new Bus("Mercedes", "ХЗ", 2012, "Германия", "", 120,3f,"120-150 мест");
        System.out.println(bus.toString());

        Cars.Truck truck = new Truck("MAC","ff",2010,"Germany","blue",120,1.2f,"К40");
        System.out.println(truck.toString());

        Car[] cars={car,bus,truck};
        allDiagnostics(cars);


        CarDriver driverA=new CarDriver("Шумахер",true,5);

    CarLicense license=new CarLicense(driverA,null);
    System.out.println(license.toString());









    }

    public static void  allDiagnostics(Car... cars){
        for (Car vehicle: cars) {
            try { //
                vehicle.checkDiagnostics();
            } catch (UnsupportedOperationException e) {//Поймано исключение- автобусы не проходят диагностику.
                // Если автобусы не проходят диагностику, то мы выдаем ошибку и идем дальше
                System.out.println(e.getMessage());
            }

        }
    }

}
