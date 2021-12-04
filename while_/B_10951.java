package while_;

//import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class B_10951 {

    public static void main(String[] args) throws IOException {
        
        //Scanner sc = new Scanner(System.in);
        //int a, b;
        //while(true){
        //   a = sc.nextInt();
        //   b = sc.nextInt();
        //   System.out.println(a+b);
        //   if(sc.hasNext() == false){ // 입력된게 있으면 true 없으면 false
        //        break;
        //   }
        //}
        
        // 안됨 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while((s = br.readLine())!=null){
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
            bw.flush(); // 밖으로 빼내면 실행안됨
        }
        br.close();
        bw.close();
    }  
    
}
