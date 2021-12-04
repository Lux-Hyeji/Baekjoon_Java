package for_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_15552 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        //System.out.println(t);

        for(int i = t; i > 0; i--){
            String s = br.readLine(); 
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            //String[] array = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
            //bw.write(Integer.parseInt(array[0])+Integer.parseInt(array[1])+"\n");
            bw.write(a+b+"\n"); // 문자형으로 자동 변환 해버림; bw.write(33+44) -> M
            //bw.newline() // 개행
            //bw.flush();  // 없어도 왜 되는거냐
        }

        br.close();
        //bw.flush(); // 여기서 버퍼에 있는거 다 출력 write만난다고 출력되는거 아님
        bw.close();

    }

}
