package arrangement1_;

import java.util.Scanner;

public class B_4344 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for(int i = 0; i < c; i++){
            int n = sc.nextInt();
            int[] su = new int[n];
            
            int sum = 0;
            for(int j = 0; j < su.length; j++){
                su[j] = sc.nextInt();
                sum += su[j];   
            }
            double avg = (double)sum / n;

            int cnt = 0;
            for(int k = 0; k < su.length; k++){
                if(su[k] > avg){
                    cnt += 1;
                }
            }
            double result = (double)cnt / n * 100;
            System.out.println(String.format("%.3f%%", result));
        }

    }
    
}
