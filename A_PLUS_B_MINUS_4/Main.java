package A_PLUS_B_MINUS_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) { //종료조건이 명시되어 있지 않음 >> 정상 종료를 위한 데이터 소스로부터 더이상 읽을 수 있는 데이터 없음을 나타내야함
                                //입력종료조건을 만들어줌 >> 더이상 읽을 수 있는데이터(EOF) 없을시 종료


            int a = sc.nextInt();
            int b = sc.nextInt();


                System.out.println(a + b);

            }
        }

    }


/** buffered reader 이용 + String Builder를 사용한 경우
 * import java.io.BufferedReader;
 * import java.io.InputStreamReader;
 * import java.io.IOException;
 * import java.util.StringTokenizer;
 *
 * public class Main {
 * 	public static void main(String args[]) throws IOException {
 *
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * 		StringBuilder sb = new StringBuilder();
 * 		StringTokenizer st;
 * 		String str;
 *
 * 		while( (str=br.readLine()) != null ){ //여기서 !=null 이 hasNextInt 역활
 *
 * 			st = new StringTokenizer(str," ");
 * 			int a = Integer.parseInt(st.nextToken());
 * 			int b = Integer.parseInt(st.nextToken());
 * 			sb.append(a+b).append("\n");
 *
 *                }
 * 		System.out.print(sb);* 	}
 * }
 */


/**  String.charAt() >>문장중 인덱스 위치에 해당되는 문자 출력
 *
 *
 * import java.io.BufferedReader;
 * import java.io.InputStreamReader;
 * import java.io.IOException;
 *
 * public class Main {
 * 	public static void main(String args[]) throws IOException {
 *
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * 		StringBuilder sb = new StringBuilder();
 * 		String str;
 *
 * 		while( (str=br.readLine()) != null ){
 *
 * 			int a = str.charAt(0) - 48;
 * 			int b = str.charAt(2) - 48;
 * 			sb.append(a+b).append("\n");
 *
 *                }
 * 		System.out.print(sb);* 	}
 * }
 */

