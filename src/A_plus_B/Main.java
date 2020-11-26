package A_plus_B;

import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException { //자바 입출력시 필수로 적어주는 예외처리 문구
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼입력 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //버퍼 출력 선언
        StringTokenizer st; //문자열 나누기
        int T = Integer.parseInt(br.readLine()); //읽어온 문자열을 int로 변환(readLine())


        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); //nextToken다음 토큰 리턴 이전것은 제거
            int B = Integer.parseInt(st.nextToken()); //숫자형의 문자열을 인자값으로 받으면(st.nextToken으로 받음)이를 10진수 integer로 반환
            int sum = A + B;

            bw.write(sum + "\n");

        }
        bw.flush();//buffer에 남아있는 데이터 강제 배출
    }
}

