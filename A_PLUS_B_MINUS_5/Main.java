package A_PLUS_B_MINUS_5;

import java.util.Scanner;


//0보다 큰수는 계속 받는다.
//합이 0이면 출력한다


public class Main {
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        while(true){

            int A=in.nextInt();
            int B=in.nextInt();

            if(A==0 && B==0){
                in.close();
                break;
            }
            System.out.println(A+B);
        }
    }
}

