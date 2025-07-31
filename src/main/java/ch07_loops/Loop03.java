package ch07_loops;
/*
    중첩 while(Nested - while)
    while(조건식1){
        반복실행문1-a
        while(조건문2){
            반복실행문2
       }
   }
 */

public class Loop03 {
    public static void main(String[] args) {
        int day = 1;
        // 1일차 1교시입니다~ 1일차 3교시입니다
        // 2일차 1교시입니다~ 2일차 3
        // 5일차..
//        while(day<4){
//            int time = 1;
//            while(time<4) {
//                System.out.print(day + "일차 " + time + "교시입니다. ");
//                time++;
//            }
//            day++;
//            System.out.println("");
//        }
        while(day<6){
            int lesson = 1;
            while(lesson<4){
                System.out.print(day + "일차 " + lesson + "교시입니다. ");
                lesson++;
            }
            day++;
            System.out.println();
        }

        //명확환 설명 이후에 추가설명
        //여기서 사용된 개념은 scope(범위)이며 전역/지역 나뉨
        /*
        이상 코드 작성(2단~ 9단)
        2x1
        2x2
        ..
        9*9
         */
//        int num1 =2;
//        int mult =1;
//        int result = 0;
//
//        while(mult<10 && num1<10) {
//            int dd=1;
//            while (num1 < 10 && dd<10) {
//                result = num1 * mult;
//                System.out.println(num1 + " x " + dd + " = " + result);
//                dd++;
//            }
//            num1++;
//            mult++;
//        }

        int dan=2;
        while (dan<10){
            int num2 =1;
            while (num2<10) {
                num2++;
                System.out.println(num2 + " x " + dan + " = " + (num2*dan));
            }
            dan++;
        }





        }
    }

