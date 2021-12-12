package string_;

import java.util.Arrays;
import java.util.Scanner;

public class B_10809 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] position = new int[26];
        Arrays.fill(position, -1);  // -1로 싹 초기화
        int num;
        for(int i = 0; i < s.length(); i++){
            num = s.charAt(i) - 97;
            if(position[num] == -1){
                position[num] = i;
            }
        }
        for(int i = 0; i < position.length; i++){
            System.out.print(position[i] + " ");
        }

    }
    
}
