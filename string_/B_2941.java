package string_;

import java.util.Scanner;

public class B_2941 {

    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = str.length();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '='){
                if(i-1 >= 0){
                    if(str.charAt(i-1) == 'c'){
                        count -= 1;
                    } else if(str.charAt(i-1) == 's'){
                        count -= 1;
                    } else if(str.charAt(i-1) == 'z'){
                        count -= 1;
                        if(i-2 >= 0){
                            if(str.charAt(i-2) == 'd'){
                                count -= 1;
                            } 
                        }
                    }
                }
            }
            if(str.charAt(i) == '-'){
                if(i-1 >= 0){
                    if(str.charAt(i-1) == 'c'){
                        count -= 1;
                    } else if(str.charAt(i-1) == 'd'){
                        count -= 1;
                    }
                }
            }
            if(str.charAt(i) == 'j'){
                if(i-1 >= 0){
                    if(str.charAt(i-1) == 'l'){
                        count -= 1;
                    } else if(str.charAt(i-1) == 'n'){
                        count -= 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
