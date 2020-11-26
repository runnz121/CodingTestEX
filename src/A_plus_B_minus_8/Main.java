package A_plus_B_minus_8;





import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int sum = A+B;



            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + sum);

        }

        sc.close();


    }

}



/**

 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 StringTokenizer st = null;
 int T = Integer.parseInt(br.readLine());

 for(int i =1; i < T; i++) {

 int A = Integer.parseInt(st.nextToken());
 int B = Integer.parseInt(st.nextToken());

 int sum = A+B;

 bw.write("Case #"+i+":"+A+"+"+B+"="+sum);
 bw.write("Case #");
 System.out.println(" df");


 }

 bw.flush();





 }*/
