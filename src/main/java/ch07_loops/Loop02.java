package ch07_loops;
/*
    1 2 3 4 5..10
    11 12 13..20
    .. 출력
    91..100
 */
public class Loop02 {
    public static void main(String[] args) {
        int i = 1;
//        while (i <= 100) {
//            int count = 0;
//            while (count < 10 && i <= 100) {
//                System.out.print(i + " ");
//                i++;
//                count++;
//            }
//            System.out.println(); // 줄바꿈
//        }
        while(i<101){
            int count = 0;
            while(count<10 && i<101)
            {
                System.out.print(i + " ");
                i++;
                count++;
            }
            System.out.println("");
        }
        /*
        while (i <= 100) {
            for (int j = 0; j < 10 && i <= 100; j++) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println(); // 줄바꿈
        }*/

        //2번 풀이 방법
        int a = 1;
        while(a<101){
            System.out.println(a + " " + (a+1) +" "+ (a+2) + " ");
            a+=10;//반복해서 9번
        }
    }
}
