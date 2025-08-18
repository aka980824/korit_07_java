package ch23_lambda;

public class CalculatorMain {

    // 정적 메서드 정의
    public static int operate(int a, int b, Calculator c){
        return c.calculate(a,b);
    }

    public static void main(String[] args) {
        // 저희가 정의한 interface Calculator 사용
        // 인터페이스 내부에는 2개의 매개변수만 정의되어 있기에
        // 추가 조작을 통해 메서드를 구현(사칙연산)

        Calculator add = (x,y) -> x+y; // 게산기 인터페이스의 객체명이 add 이고, 내무 메서드는 calculate()
        Calculator sub = (x,y) -> x-y; // 게산기 인터페이스의 객체명이 sub 이고, 내무 메서드는 calculate()
        Calculator mul = (x,y) -> x*y;
        Calculator div = (x,y) -> x/y;

        System.out.println(add.calculate(2,3)); // 15 번 라인 주석 참고시, 올바른 메더스 호출 방식
        System.out.println(sub.calculate(2,3));
        System.out.println("--- static method 호출 방식 결과 ---");
        System.out.println("2+3 = "+operate(2,3,add));
        // 3번째 매개변수로 Calculator 인터페이스의 서브 클래스를 받습니다.
        // 그리고 return 문을 보시면 해당 객체의 .calculate() 메서드를 호출하는것을 확인
        // add.calculate()호출하여 5출력
        // 23 코드해석을위해
        // 계산기 인터페이스/ 계산기메인의 static.method와 메인에서의 람다식을 전부 볼 필요가 있음
        System.out.println("2 * 3 = "+operate(2,3,mul));

    }
}
