package ch07_loops;

import java.util.Scanner;

/*
    몇줄의 별을 생성하시겟습니까?

 */
public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j= 0; j < i + 1; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
        for (int i = row-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("★");
            }
            System.out.println();

        }




    }
}

