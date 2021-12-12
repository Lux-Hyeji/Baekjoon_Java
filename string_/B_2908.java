package string_;

import java.util.Scanner;

public class B_2908{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" "); // 쪼개기

        StringBuffer sb1 = new StringBuffer(arr[0]); //뒤집기
        StringBuffer sb2 = new StringBuffer(arr[1]); 

        String a = sb1.reverse().toString(); //뒤집기
        String b = sb2.reverse().toString(); 

        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        if(c>d){
            System.out.println(c);
        } else {
            System.out.println(d);
        }

    }

}