package Sum_Cycle;

import java.io.*;


public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy = T;

        do{//무조건 실행
             T = ((T%10)*10 + ((T/10) + (T%10))%10); //해당 로직
             cnt++; //반복 횟수를 출력하기 위한 변수
        } while (copy !=T);

        System.out.println(cnt); //횟수를 출력
    }

}
