package lecture01;

public class Kansuu {

    int min(int[] score) {
        int min=100;
        for(int i=0;i<score.length;i++){
            if(min>=score[i]){
                min=score[i];
            }
        }
        return min;
    }

    int max(int[] score){
        int max=0;
        for(int i=0;i<score.length;i++){
            if(max<=score[i]){
                max=score[i];
            }
        }
        return max;
    }

    double average(int[] score){
        int sum=0;
        for(int i=0;i<score.length;i++){
            sum = sum + score[i];
        }
        return (double)sum/score.length;
    }
}
