package ch07_loops;

import java.util.Scanner;

/*
    for 반복문(for loop)
    : 일반적인 경우, 횟수가 고정되어 있을때, 사용

    형식:
    for(시작값, 종료값, 증가값){
        반복문
    }
 */
public class Loop04 {
    public static void main(String[] args) {
//        for(int i = 1; i < 101; i++){
//            System.out.println(i);
//        }
    //1~100까지의 합을 구하고, 한번만 출력
//        int result = 0;
//        for(int i=1; i<101;i++){
//            result = result+i;
//        }
//        System.out.println(result);

        //1부터 100까지 중 홀수 합을 구하는 FOR문 작성
        //for 내부에 if를 중첩으로 이용가능
        //중첩이용해서 하는법과 for이용해서하는 2가지로작성
//        int sum=0;
//          for(int i=1; i<101 ; i+=2){
    //            sum +=i;
    //        }
    //        System.out.println(sum);
//        for(int i =1; i<101; i++){
//            if(i % 2 == 1){
//                sum +=i;
//            }
//        }
//        System.out.println(sum);

        /*
            숫자를 입력받아서 1부터 n까지 더하는 반복문 작성
        */
        Scanner scanner = new Scanner(System.in);
        int i =0;
        System.out.println("1부터 몇까지 더하시겠습니까 >>> ");
        i = scanner.nextInt();
        int sum3 = 0;
        for(int a = 1; a<(i+1); a++){
            sum3 +=a;
        }
        System.out.println(sum3);

    }
}
