package function;

public class B_4673 {

    public static void main(String[] args) {
        
        int[] arr = new int[10001];
        int tmp;
        for(int i = 1; i < arr.length; i++){
           if(i < 10){
                arr[i+i] = 1;
            } else if(i < 100){
                arr[i+(i/10)+(i%10)] = 1;
            } else if(i < 1000){
                arr[i+(i/100)+((i%100)/10)+((i%100)%10)] = 1;
            } else if(i < 10000){
                tmp = i+(i/1000)+((i%1000)/100)+(((i%1000)%100)/10)+(((i%1000)%100)%10);
                if(tmp <= 10000){
                    arr[tmp] = 1;
                }
            }        
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i]==0){
                System.out.println(i);
            }
        }

    }
    
}
