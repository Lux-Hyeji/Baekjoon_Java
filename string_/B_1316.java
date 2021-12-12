package string_;

import java.util.Scanner;

public class B_1316 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        String[] word = new String[n];
        char ch;
        boolean check = true;
        for(int i = 0; i < word.length; i++){
            word[i] = sc.next();
            for(int j = 0; j < word[i].length(); j++){
                ch = word[i].charAt(j);
                if( j+1 < word[i].length()){
                    if(ch == word[i].charAt(j+1)){
                        continue;   // aabac 반례 j++할시
                    } else {
                        for(int k = j+2; k < word[i].length(); k++){
                            if(ch == word[i].charAt(k)){
                                count -= 1;
                                check = false;
                                break;
                            }
                        }
                    }
                }
                if(check == false){
                    check = true;
                    break;
                }
            }
        }
        System.out.println(count);
    }
    
}
