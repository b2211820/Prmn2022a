package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        GasStation gs = new GasStation();
        gs.refuel(c);
        c.run();
    }
}
