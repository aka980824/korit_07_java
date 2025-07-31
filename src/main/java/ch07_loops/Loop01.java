package ch07_loops;

public class Loop01 {
    public static void main(String[] args) {
        // 1부터 100까지 출력
//        int i=1;
//        while (i<101){
//            System.out.println(i);
//            i++;    // i를 증가시켜 100까지 출력
//            // 특정 시점에 false가 되도록 지정
//        }
//
//        int j=0;
//        while(j<100){
//            System.out.println(++j);
//        }
//        System.out.println( "최종 값 : " + j);

        //그래서 1부터 10까지의 합 구하는 방식
//        int num1 = 1;
//        int sum = 0;
//
//        sum = (100*101)/2;
//        System.out.println(sum);
//        sum=0;
        //for를 이용하지 않고, 1부터 100까지의 합을 구하시오.
        //정석
//        while(num1 < 101){
//            sum += num1;
//            num1++;
//        }
//        System.out.println(sum);
//        while (num1 < 101) {
//            sum = sum + num1;
//            num1++;
//        }
//        System.out.println(sum);
        int sum = (100*101)/2;
        System.out.println("등차수열의 합계 공식 이용 : " + sum);
        /*
        사실 1부터 1씩 증가하는 합 공식은 while 반복문 이용하는것은 비효율
        비효율은 위 코드들을 참고할 시 확인가능 (38~39)
        허나 while은 java 문법이고, if와 종일하게 중첩으로 가능하여, while내부에 if를 이용가능

        예로, 공차가 '2'이고 a1이 0인 수열의 a50까지의 합을 구하시오 < 라는 문제가 나왔을 경우
        38~39방식은 불가능함
         */
        int j = 0;
        int sum2 = 0;
//        while (j<101){
//            if(j%2 ==0){
//                sum2 +=j;
//            }
//            j++;
//        } // 짝수합 + 정석버전
        while (j <101){
            sum2 += j;
            j+=2;
        }
        System.out.println(sum2);
        /*
           1부터 100까지
           1
           2
           3
           ...
           100
           으로는 출력하는 것은위에 예시가 있으나, 1 2 3 4 5 .. 100출력
         */
        int i =1;
        while(i<101){
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        int k = 0;
        while (k<100){
            System.out.print(++k + " ");
        }
    }

}


