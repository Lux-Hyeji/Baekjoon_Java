package function;

import java.util.Scanner;

class Test{

    public long sum(int[] a){
        long tot = 0;
        for(int i = 0; i < a.length; i++){
            tot += a[i];
        }
        return tot;
    }

}

public class B_15596{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Test t = new Test();
        System.out.println(t.sum(arr));
        
    }

}