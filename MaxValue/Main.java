package MaxValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] arr = new int[9];
        int max = arr[0];
        int index=0; //index 초기화

        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();

            if(max<arr[i]) {
                max = arr[i];
                index = i+1; //index는 i값 +1 로 지정

            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}
