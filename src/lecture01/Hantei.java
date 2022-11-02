package lecture01;

public class Hantei {
    void output(int[] score) {
        for (int i = 0; i < score.length; i++) {
            if (score[i] < 60) {
                System.out.println(i + "番の人は" + score[i] + "点 不可");
            } else if (score[i] >= 60 && score[i] < 70) {
                System.out.println(i + "番の人は" + score[i] + "点 可");
            } else if (score[i] >= 70 && score[i] < 80) {
                System.out.println(i + "番の人は" + score[i] + "点 良");
            } else if (score[i] >= 80 && score[i] < 90) {
                System.out.println(i + "番の人は" + score[i] + "点 優");
            } else {
                System.out.println(i + "番の人は" + score[i] + "点 秀");
            }
        }
    }
}
