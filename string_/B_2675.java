package string_;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_2675 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int num;
        for(int i = 0; i < t; i++){
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            num = Integer.parseInt(arr[0]);
            for(int j = 0; j < arr[1].length(); j++){
                for(int k = 0; k < num; k++){
                    System.out.print(arr[1].charAt(j));
                }
            }
            System.out.println(); 
        }

    }
    
}
