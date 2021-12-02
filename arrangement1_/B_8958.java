package arrangement1_;

import java.util.Scanner;

// charAt()은 String타입의 문자열에서
// 해당 위치에 있는 문자만을 char타입으로 변환해
// 사용할 수 있게 만들어주는 녀석이다.
// String str = new String("예시");
// char c = str.charAt(0);
// 의 형태로 사용할 수 있으며
// 여기에서 ( )안의 0은 해당 문자열의 위치를 가리킨다.
// 따라서 charAt(0)이라면 문자열의 0번째 문자를 char타입으로 변환해주는 것이다.

public class B_8958 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] OX = new String[sc.nextInt()];
        int sum;
        int cnt;
        for(int i = 0; i < OX.length; i++){
            OX[i] = sc.next(); // 공백을 기준으로 개행무시 string 반환, nextline() -> 한라인 개행포함 string 반환
            // System.out.println(OX[i]);
            cnt = 0;
            sum = 0;
            for(int j = 0; j < OX[i].length(); j++){
                if(OX[i].charAt(j)=='O'){ 
                    cnt += 1;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }

    }
    
}
