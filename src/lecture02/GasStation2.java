package lecture02;

public class GasStation2 {
    void refuel(Car2 car) {
        car.fuel2 = car.fuel2 + 20;
        System.out.println("給油したことによりfuel2が20増えました。");
    }
}
