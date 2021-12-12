package string_;

import java.util.Scanner;

public class B_1152 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        //System.out.println(s);
        char ch;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch == ' '){
                count += 1;
            }
            if(i==s.length()-1){
                if(ch != ' '){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
