package ch12_arrays;
/*
    다차원 배열(Muti-Dimensional Array) 중 2차원배열
    : 다차원 배열은 2차원 이상의 배열을 의미하나. 개발 환경 상 2차원 배열 이상을 다루는 경우는 극히 드물기에 2차원 배열을 기준으로
    수업

    형식
    int[][] arr01 =new int[크기][크기] #1;
    int[][] arr02 =new int[크기][]    #2;
    int[][] arr03 = {{1,2},{3,4},{5,6}};

    ↓↓↓ (윈도우 + .)
    2차원 배열 선언시,열의 크기는 지정하지않아도 되지만. 횡의 크기는 항상 지정해야함
    -> 2번 방식
    1열 2열
    ↓   ↓
   { 1, 2 } -> 1행 가로줄 = 행
   { 3, 4 }
   { 5, 6 }

 */

import java.util.Arrays;

public class Array13 {
    public static void main(String[] args) {
        int[][] arr03 = {{1,2},{3,4},{5,6}};
        System.out.println(arr03[2][0]);
        System.out.println(arr03[2]);   // [I@36baf30c
        System.out.println(arr03);      // [[I@7a81197d
        System.out.println(Arrays.toString(arr03)); //[[I@5ca881b5, [I@24d46ca6, [I@36baf30c]

        //2차배열의 element 추출 -> 중첩 for문사용
        for(int i=0;i< arr03.length;i++){
            // 2중 반복문
            for(int j=0;j<arr03[i].length;j++){
                System.out.println(arr03[i][j]);
            }
        }
        /*
            향상된 for문으로 2중배열 내부의 element추출
         */
        System.out.println();
        for (int[] a : arr03) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
