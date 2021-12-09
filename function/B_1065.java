package function;

import java.util.Scanner;

public class B_1065 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<100){
            System.out.println(n);
        } else{
            int count = 99;
            int a,b,c;
            for(int i = 100; i <= n; i++){
                a = i / 100;
                b = (i % 100) / 10;
                c = (i % 100) % 10;
                if((b-a)==(c-b)){
                    count += 1;
                }
            }
            System.out.println(count);
        }

    }
    
}
