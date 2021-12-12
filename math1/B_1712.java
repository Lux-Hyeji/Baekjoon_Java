package math1;

import java.util.Scanner;

public class B_1712 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k;
        if(b>=c){  // 이득이 생길수가 없다
            k = -1; 
            System.out.println(k);
        } else {
            k = (a / ( c - b ) ) + 1;
            System.out.println(k);
        }

    }
    
}
