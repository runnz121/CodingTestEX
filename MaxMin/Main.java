package MaxMin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int max = -1000000; //최대값을 배열에 넣기 위한 초기화 이렇게 거꾸로 줘야 최대 최소값비교가가능
        int min = 1000000; //최소값을 배열에 넣기 위한 초기화


        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();

            if (max<arr[i]){

                max = arr[i];

                }
            if(min>arr[i]){

                min = arr[i];

                }

            }
        System.out.println(min+" "+max);

        }

    }




