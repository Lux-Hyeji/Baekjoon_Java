package string_;

import java.util.Scanner;

public class B_1157 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toUpperCase();

        int num;
        int[] arr = new int[26];
        for(int i = 0; i < word.length(); i++){
            num = word.charAt(i) - 65;
            arr[num] += 1;
        }
        char s = ' ';
        int max = 0;
 
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
                num = j + 65;
                s = (char)num;
            } else if(arr[j] == max){
                s = '?';
            } 
        } 
        System.out.println(s);
    }
    
}
