package CountNumber;



import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int multi = a * b * c;


        String smulti = Integer.toString(multi); //숫자를 문자로
       // String[] arr = smulti.split(""); //문자를 나눠서 문자배열에 넣는다
      // int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray(); //문자 배열을 숫자 배열로 바꿔준다.

        sc.close();

        for (int i = 0; i < 10; i++) {
            int count = 0; //count 초기화 부분을 for문 안에 넣기
          for (int j=0; j<smulti.length(); j++){ // 현재 '문자열'임으로 length가 아닌 length()가 와야한다
              if((smulti.charAt(j)-'0')==i){ //charAt으로 찾을시 -0 or -48을 써주어야 한다. 아니면 아스키코드로 반환
                  count++;
              }
        }
            System.out.println(count);



        }
    }
}


/**
 * import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.io.InputStreamReader;
 *
 * public class Main {
 * 	public static void main(String[] args) throws IOException {
 *
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 * 		int[] arr = new int[10];
 *
 * 		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
 *
 * 		String str = String.valueOf(val); >>문자열을 str에 담는다.
 *
 * 		for (int i = 0; i < str.length(); i++) {
 * 			arr[(str.charAt(i) - 48)]++;
 *                }
 *
 * 		for (int v : arr) {
 * 			System.out.println(v);
 *        }
 ** 	}
 * }
 */

/**
 * import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.io.InputStreamReader;
 *
 * public class Main {
 * 	public static void main(String[] args) throws IOException {
 *
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 * 		int val = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
 * 		int[] arr = new int[10];
 *
 * 		while(val!=0) {
 * 			arr[val%10]++;
 * 			val/=10;
 *                }
 *
 * 		for(int result : arr) {
 * 			System.out.println(result);
 *        }* 	}
 * }
 */
