package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter(210,100,"Fighter1");
        Fighter fighter2 = new Fighter(180,150,"Fighter2");

        while(true){
            if(fighter1.isAlive()){
                System.out.println(fighter1.getName()+"は倒れた。");
                System.exit(0);
            }
            fighter1.attack(fighter2);
            fighter2.setHitPoint(fighter2.getHitPoint());
            System.out.println(fighter2.getName()+ "の残りhitPoint : " + fighter2.getHitPoint());

            if(fighter2.isAlive()){
                System.out.println(fighter2.getName()+"は倒れた。");
                System.exit(0);
            }
            fighter2.attack(fighter1);
            fighter2.setHitPoint(fighter1.getHitPoint());
            System.out.println(fighter1.getName()+ "の残りhitPoint : " + fighter1.getHitPoint());
        }
    }
}
