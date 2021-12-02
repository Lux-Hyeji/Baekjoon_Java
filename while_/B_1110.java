package while_;

import java.util.Scanner;

public class B_1110 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a,b,sum;
        int su = n;
        int count = 0;
        do {
            a = su / 10; // 십의자리
            b = su % 10; // 일의자리
            sum = (a + b) % 10; // 두개 합
            su = b * 10 + sum; // 새로운 수
            count += 1; // 사이클    
        } while (su != n);

        // while(su != n){
        //     a = su / 10; // 십의자리
        //     b = su % 10; // 일의자리
        //     sum = (a + b) % 10; // 두개 합
        //     su = b * 10 + sum; // 새로운 수
        //     count += 1; // 사이클
        // }
        System.out.println(count);

    }

}
