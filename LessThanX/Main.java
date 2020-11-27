package LessThanX;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];


        for (int i = 0; i < a; i++) {

            arr[i] = sc.nextInt(); //입력값이 10 5
                                   //1 2 3 4 6 5 6 9 10 이런식이기 때문에 순차로 받기위해선 입력값으로 받아야 한다.

        }

        sc.close();

        for (int i = 0; i < a; i++) {
            if (arr[i] < b) {
                System.out.print(arr[i] +" ");
            }
        }
    }
}