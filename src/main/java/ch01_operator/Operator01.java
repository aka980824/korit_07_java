package ch01_operator;
/*
    Camel case -> Java 상에서의 변수 표기법 (JS에서도 사용함)
    Snake case -> Java에서는 쓸일이 없으나, 전체 상수 사용자에 비슷한 표기법이 사용됨
    Pascal case -> 첫 번째 문자가 대문자고 나머지는 소문자로 가다가 두 버내 단어의 첫 번째 문자는 또 대문자
        ex) 한 단어짜리 : Operator01
            복수단어 : OperatorTestResult -> Pascal case는 클래스 명명 규칙에 이용됨.
*/
public class Operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;

        // 이전 단계에서, 자료형, 변수형, 데이터에 대해 학습하였음
        // 이번에도 '='을 학습예정
        i = i+10;
        /*
         대임 연산자 = : = 왼쪽과 오른쪽이 같다는 의미가 아니라 오른쪽에 있는 데이터를 왼쪽에 있는 변수에 대입한다는 의미.

         그렇다면 왼쪽과 오른쪽이 같은 값이다, 라고 표시할 때는 어떻게 할까요?
         -> == (java/python에서만) ===(javascript)
         */

        //일반 연산자
        /*
            + : 더하기
           - : 뻬기
           * : 곱하기
           / : 나누기
           % : 나머지
         */
        int a = 5;
        int b = 2;
        double result = (double) a / b; // double 은 강제 형변환을 의미
        System.out.println("a/b = " + a/b);
        System.out.println("a+b = " + (a + b));
        System.out.println("a/b(double) = " + result);
        //그래서 생각보다 코딩할 때에도 얘네가 멍청해서 하나하나 잘 지정해야함.
        // 즉 개발자는
        // 컴퓨터가 잘 작동할 수 있도록, 잘 명령을 내리는 사람이다, 라고 생각해주시고
        // 좀 어르고 달래야 한다(참을성)

        /*
            복합 대입 연산자
            1) +=
            2) -=
            3) *=
            4) /=
         */
        int num1 = 1;
        System.out.println(num1);
        num1 += 2;  // num1 = num1 + 2; 라는 의미
        System.out.println(num1);
        num1 -= 1;  // num1 - 1
        System.out.println(num1);
        num1 *= 10; // num1 *10
        System.out.println(num1);
        num1 /= 5;  // num1 /5
        System.out.println(num1);

        int j = 10;
        System.out.println(j);
        System.out.println(j++);    // 변수명 ++ : 코드를 실행 시킨 이후에 j 에 +1를 더하여 값을 대입
        System.out.println(j);      // 위에서 행한 값이 j로 반영되어 j = 10+1 출력
        System.out.println(++j);    // ++변수명 : 코드 실행전 1를 플러스하여 대입 하기에 11+1 = 12 출력\
        System.out.println(j);      // 위의 값 12 
        System.out.println(j--);    // 12출력후 j에 11
        System.out.println(j);      // 위 11값
        System.out.println(--j);    // -1 후 출력 (10)
        System.out.println(j);
        // 변수명-- : 코드를 실행 시킨 후에 j에 1를 감함
        // --변수명 : 실행전 감소후 출력

        int age = 10;
        System.out.println("제 나이는 " + age + "살입니다.");
        System.out.println("내년에는 " + age+1 + "살이 됩니다.");
        System.out.println("내년에는 " + (age+1) + "살이 됩니다."); // 101이아닌 11일경우 묶으면댐 shift+9
        System.out.println("내년에는 " + ++age + "살이 됩니다.");
        //Operator02 생성
    }
}
