package lecture05;

public class Exercise5_7 {
    public static void main(String[] args) {
        Insect[] exrciseList = new Insect[4];

        exrciseList[0] = new Insect();
        exrciseList[1] = new Butterfly();
        exrciseList[2] = new Locust();
        exrciseList[3] = new SwallowtailButterfly();

        for(Insect insect : exrciseList){
            insect.move();
        }
    }
}
