package calculate;

import java.util.Scanner;

public class B_2588 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int r_3 = num1 * (num2 % 10);
        int r_4 = num1 * ((num2 % 100) / 10);
        int r_5 = num1 * (num2 / 100);
        int r_6 = r_3 + (r_4*10) + (r_5*100);

        System.out.println(r_3);
        System.out.println(r_4);
        System.out.println(r_5);
        System.out.println(r_6);

    }
    
}
