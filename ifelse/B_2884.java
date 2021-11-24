package ifelse;

import java.util.Scanner;

public class B_2884 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (h==0){
            if(m<45){
                m = m + 15;
                h = 23;
            } else {
                m = m - 45;
            }
        } else {
            if(m<45){
                m = m + 15;
                h -= 1;
            } else {
                m = m - 45;
            }
        }
        System.out.print(h);
        System.out.print(' ');
        System.out.println(m);

    }
    
}
