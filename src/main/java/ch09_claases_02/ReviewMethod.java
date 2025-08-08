package ch09_claases_02;

import java.util.Scanner;

/*
    메서드 - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶은 것
    (Method)

    형식 :
        (접근지정자) 리턴타입 메서드명(매개변수1,2) {
            내부에서 순차적 실행될 코드(비지니스 로직)
        }
    ex) 정의 예시
     public void writeSchedule(String data, String content){
        System.out.println(date + "일의 스케줄은 다음과 같습니다."
        System.out.println(content);
    }
    ex) 호출 예시
        객체명.wroteSchedule("20250804","메서드/오버로딩/클래스 복습");

 */
public class ReviewMethod {
    public void writeSchedule(String data, String content){
        System.out.println(data + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }
    // 1, writeSchedule를 overloading하여 매개변수1의 자료형을 int 로 바꾸고,
    // writeSchedule(20250805, "~~~"); 를 호출
    // 2. call2()유형으로 작성
    // divideBySeven 메서드 정의
    // 특정 int 숫자 하나를 매개변수로 받아, 그 숫자가 7의 배수인지를 확인하는 메서드를 작성하시오
    // 실행 예
    // 임의의 숫자 입력하세요 : 14
    // 14는 7의 배수가 맞습니다
    // 임의의 숫자 입력하세요 : 84
    // 84는 7의 배수가 아닙니다
    // 이를 call1()유형으로 overloading을 이용하여 만드시오
    public void writeSchedule(int data, String content){
        System.out.println(data + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }
    public void divideBySeven(int num){
        if(num %7 ==0){
            System.out.println(num + "은 7의 배수가 맞습니다.");
        }else{
            System.out.println(num + "은 7의 배수가 아닙니다.");
        }
    }
    public void divideBySeven(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("임의의 숫자를 입력하세요 : ");
        int num = scanner.nextInt();

        if(num % 7 == 0){
            System.out.println("call1()유형 ");
            System.out.println(num + "은 7의 배수가 맞습니다.");
        } else {
            System.out.println("call1()유형 ");
            System.out.println(num + "은 7의 배수가 아닙니다.");
        }
//        divideBySeven(num); //메서드 내부에서 다른 method로 호출하는 것또한 가능
    }



    public static void main(String[] args) {
    //메서드 호출 영역
        ReviewMethod reviewMethod = new ReviewMethod();
//        reviewMethod.writeSchedule("20250804","메서드/오버로딩/클래스 복습");
//    //메서드 정의영역
//        reviewMethod.writeSchedule(20250804,"메서드/오버로딩/클래스 복습");

        Scanner scanner = new Scanner(System.in);
//        System.out.print("임의의 숫자를 입력하세요 : ");
//        int num = scanner.nextInt();
//        reviewMethod.divideBySeven(num);

        reviewMethod.divideBySeven();
    }


}
