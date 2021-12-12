package string_;

import java.util.Scanner;

public class B_11720{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String temp = sc.next();
        int tot = 0;
        for(int i = 0; i < temp.length(); i++){
            tot += Character.getNumericValue(temp.charAt(i)); // 문자하나를 int형으로 변환
            
        }
        System.out.println(tot);

    }

}