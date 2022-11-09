package lecture02;

public class Car2 {
        int fuel2;
        Tire[] tires = new Tire[4];
        Engine engine;

        Car2(Tire[] tires,Engine engine) {
            this.fuel2 = 0;
            for(int i = 0; i < tires.length; i++){
                this.tires[i] = tires[i];
            }
            this.engine = engine;
        }

        void run() {
            if (this.fuel2 > 0) {
                fuel2 = fuel2 - 1;
                System.out.println("燃料を1消費して走りました。");
            } else {
                System.out.println("燃料が足りないため走れませんでした。");
            }
        }

        void startEngine() {
            Engine e = new Engine(4000);
            e.start();
    }
}
