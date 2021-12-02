package arrangement1_;

import java.util.Scanner;

public class B_10818 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int big = -1000000;
        int small = 1000000;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > big){
                big =  arr[i];
            }
            if(arr[i] < small){
                small = arr[i];
            }
        }
        System.out.print(small+" "+big); // ' ' 이거는 연산해버림
    }
    
}
