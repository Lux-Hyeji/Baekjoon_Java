package for_;

import java.util.Scanner;

public class B_10871 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] array = new int[n];  
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(array[i] < x){
                System.out.print(array[i]);
                System.out.print(" ");
            }
        }  

    }
    
}
