package arrangement1_;

import java.util.Scanner;

public class B_3052 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] su = new int[10];
        int[] index = new int[42];
        for(int i = 0; i < su.length; i++){
            su[i] = sc.nextInt();
        }
        for(int i = 0; i < su.length; i++){
            int j = su[i] % 42;
            index[j] += 1;            
        }
        int count = 0;
        for(int i = 0; i < index.length; i++){
            if(index[i] > 0){
                count += 1;
            }
        }
        System.out.println(count);
    }
    
}
