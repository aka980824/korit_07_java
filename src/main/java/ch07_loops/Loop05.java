package ch07_loops;

import java.util.Scanner;

/*
    중첩 for 가능
    for(조건){
        반복실행문
            for(조건2){ㅖ}
            }
        }
        실행문2
    }
    for문 이용 1일차 1교시입니다. ~ 5일차  3교시입니다
 */
public class Loop05 {
    public static void main(String[] args) {
//        for(int day=1;day<6;day++)
//        {
//            for(int les=1;les<4;les++)
//            {
//                System.out.println(day + "일차 " + les + " 교시입니다");
//            }
//        }
        /*
        1 2 3 4 5 6 7 8 9 10
        ..
        91 ..100
         */
//        for(int a =1; a<11; a++){
//            int b;
//            for(b = 1; b < 11; b++) {
//                System.out.print( b + " ");
//                a++;
//            }
//            System.out.println();
//        }

//        for(int i=1;i<101;i++){
//            System.out.print(i + " ");
//            if(i%10 ==0){
//                System.out.println();
//            }
//        }    39~44문항 모범답안
//
//        for(int i2 =1; i2<10; i2+=10)
//        {
//            System.out.println(i2+ " " + (i2+1) +" " + (i2+2));
//        }

        /*
        숫자 입력받아 n까지 더하는 반복문을 for문으로 작성
        예, 1부터 x까지 더하시겠습니까?
        1부터 10까지의 합은 x입니다

        1부터 10까지의 숫자중 짝수의 합도 도출하시오/
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.print("1부터 몇까지 숫자를 합하시겠습니까? >>> ");
//        int i3 = scanner.nextInt();
//        int sum = 0;
//        for(int a=1;a<(i3+1);a++)
//        {
//            sum +=a;
//        }
//        System.out.println("1부터 " + i3 + "까지의 합은 " + sum + "입니다.");
//

//        System.out.print("1부터 몇까지 짝수를 합하시겠습니까? >>> ");
//        int n2 = scanner.nextInt();
//        int sum2 = 0;
//        for(int i4 =0; i4 <(n2+1) ; i4+=2){
//            sum2 +=i4;
//        }
//        System.out.println("1부터 10까지의 짝수의 합은 : " + sum2 + " 입니다");
        System.out.print("1부터 몇까지 숫자를 입력 하시겠습니까? >>> ");
        int n = scanner.nextInt();
        int sum =0;
        int sumEven = 0;
        int sumOdd = 0;
        int sumSol =0;
        for(int i =1;i <n+1; i++){
            sum +=i;
            if(i%2 ==0){
                sumEven += i;
            }
//            if(i%2 ==1){
//                sumSol += i;
//            }
            else {
                sumSol += i;
            }
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println("1부터 10까지의 짝수의 합은 : " + sumEven + " 입니다");
        System.out.println("1부터 10까지의 홀수의 합은 : " + sumSol + " 입니다");
        }
}

