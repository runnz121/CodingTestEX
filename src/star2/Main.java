package star2;


import java.util.Scanner;

public class Main { //별 거꾸로 출력

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();


        for (int i = 1; i <= star; i++) {

            for (int j = star; j>0; j--) { //초기값 : 최대값, 범위 j가0보다 클때까지, j는 감소
                if (i < j) {               //처음찍히는 곳 맨 마지막부분
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }

            }
            System.out.println(' ');
        }

    }}
