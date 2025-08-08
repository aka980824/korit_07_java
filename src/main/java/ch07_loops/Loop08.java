package ch07_loops;
/*
           *
         * *
       * * *
     * * * *
       * * *
         * *
           *
 */

public class Loop08 {
    public static void main(String[] args) {

        // 위쪽 삼각형
        for(int i=0;i<5;i++) {
            // 공백: 줄 번호만큼 공백 출력 (0부터 시작)
            for(int j=0;j<5-i-1;j++) {
                System.out.print(" ");
            }
            // 별: i+1개 출력
            for(int k=0;k<i+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

// 아래쪽 삼각형
        for(int i=5-2;i>=0;i--) {
            // 공백: 줄 번호만큼 공백 출력 (0부터 시작)
            for(int j=0;j<5-i-1; j++) {
                System.out.print(" ");
            }
            // 별: i+1개 출력
            for(int k=0;k<i+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
