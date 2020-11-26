package LessThanX;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //수열
        int b = sc.nextInt(); //보다 작은 기준값


        int[] arr = new int[a]; //배열 선언

        for (int j = 0; j <= arr.length-1; j++) {
            arr[j] = (int) (Math.random()*10000)+1; //랜덤 수 생성

            for(int i = 0; i<=j-1; i++) {
                while (arr[j]==arr[i]) { //같으면
                    arr[i] = arr[j] = (int) (Math.random()*10000)+1; //계속 생성
                }//while end
            }//for i end
        }//for j end


        //print
        for(int j = 0; j<arr.length; j++) { //j의 값을 출력한다.
            System.out.println(arr[j]+" ");
        }
    }
}
        /**for (int i = 1; i <= a; i++) {
            if (i<b) {
                System.out.print(i+" ");
            }



            }

        }


    }

*/
