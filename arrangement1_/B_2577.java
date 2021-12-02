package arrangement1_;

import java.util.Scanner;

public class B_2577 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mul = a * b * c;
        int[] index = new int[10];
        while(mul > 0){
            int i = mul % 10;
            index[i] += 1; 
            mul = mul / 10;
        }
        for(int i =0; i < index.length; i++){
            System.out.println(index[i]);
        }
    

    }
    
}
