package string_;

import java.util.Scanner;

public class B_sd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int cnt = 0;
        Character a = ' ';
        for(int i = 0; i<S.length(); i++){
            Character inv = S.charAt(i);
            if(inv.equals(a)){
                cnt +=1;
            }
        }
        Character first = S.charAt(0);
        Character end = S.charAt(S.length()-1);

        if(first.equals(a)){
            cnt -=1;
        }
        if(end.equals(a)){
            cnt -=1;
        }
        System.out.print(cnt+1);
    }
}

