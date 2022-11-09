package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Tire[] t = new Tire[4];
        new Tire(65);
        Engine e = new Engine(4000);
        Car2 c2 = new Car2(t,e);
        GasStation2 gs2 = new GasStation2();
        gs2.refuel(c2);
        c2.startEngine();
        c2.run();
    }
}
