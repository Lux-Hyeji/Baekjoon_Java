package arrangement1_;

import java.util.Scanner;

public class B_1546{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] score = new double[n];
        for(int i = 0; i < score.length; i++){
            score[i] = sc.nextInt();
        }
        double M = 0;
        for(int i = 0; i < score.length; i++){
            if(score[i] > M){
                M = score[i];
            }
        }
        double sum = 0.0;
        for(int i = 0; i < score.length; i++){
            score[i] = score[i] / M * 100;
            sum += score[i];
        }
        System.out.println(sum/n);
    }
}