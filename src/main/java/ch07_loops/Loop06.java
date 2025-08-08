package ch07_loops;

import java.util.Scanner;

/*
 Nested for - loop
 for(조건문){
    반복실행문1-a
        for(조건문)
            {반복 실행문 }
                반복실행문1-b
            for(조건)
        {실행문3}`
 }실행문 1-c

    *
    **
    ***
    ...
    고려사항 1) 반복 몇번? 무엇을 기준올 반복?

 */
public class Loop06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        for(int i=0;i<6;i++)
//        {
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for(int i2=5;i2>0;i2--)
//        {
//            for(int j2=i2;j2>0;j2--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
/*
        별 찍기를 통한 구조학습에서 i/j 가 0일때 for문이 작동안함
 */
        for (int i=0; i<5 ; i++){
            for(int j=5 ;j-i>0;j--){
                System.out.print("★");
            }
            System.out.println();
        }
/*
        100~1까지 역순으로 출력
        윈도우 + . < emoticon
*/

        for(int a=100; a>0;a--){
            System.out.println(a);
        }



    }

}
