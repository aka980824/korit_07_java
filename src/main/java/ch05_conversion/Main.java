package ch05_conversion;

public class Main {
    public static void main(String[] args) {
         // 1. upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환시키는 것
        //자료형 변수형 = 값;
        char cast1 = 'A';
        System.out.println("원형 : " +  cast1);
        // 업캐스팅 방법 #1
        // 형 변환을 하기 위해서는 '(바꿀데티어타입) 변수명'으로 작성하면 됩니다
        System.out.println("변형 : " +(int)cast1); // A = 65

        char cast2 = 'a';
        System.out.println("원형 : " + cast2 );
        System.out.println("변형 : " + (int)cast2); // a = 97

        // 업캐스팅 방법 #2
        // 새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방법입니다.
        char cast3= 'b';
        int casted3 = cast3; // 값을 넣을때 int 사용 X
        // 대신 위를 볼 경우 변수를 선언할 때의 자료형이 반환되기를 원하는 자료형을 명시
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + casted3);

        // 다운캐스팅 : 용량이 더 적은 자료형으로 변형하는 것을 의미
        int cast4 = 99; // < #1
        int cast5 = 100; // < #2
        // 지시사항 : 다운캐스팅 하는 방법은 업스캐팅 방법 #1, 2 를 참조하여 char로 바꾼 후
        // 콘솔창에 원형과 변형을 모두 출력
        char cast4ed = (char) cast4;
        char cast5ed = (char) cast5;
        System.out.println("cast4 원형 : " + cast4 );
        System.out.println("cast4 변형 : " + cast4ed);
        System.out.println("cast5 원형 : " + cast5);
        System.out.println("cast5 변형 : " + cast5ed);
/*      다른 방법
        System.out.println("cast4 원형 : " + cast4 ); System.out.println("cast4 변형 : " + (char)cast4);System.out.println("cast5 원형 : " + cast5); System.out.println("cast5 변형 : " + (char)cast5);
*/
        /*
        현재 char cast5ed = cast5; 행에서 오류가 발생하는 것은 정상.
        추후 수업에서 더 중요하게 작용될 개념인데, upcasting의 경우에는 메모리 용량이 커지면 되니까 기존 데이터가 변형이 일어날 가능성이 없어져, 암시적(implicit)
        으로 변형이 가능하지만, downcasting의 경우에는 데이터 용량이 축소되는 과정에서 변수가 메모리 용량을 벗어나게 되는 경우가 발생한다.
        (강남스타일을 예시로 들경우, 30억이 넘는 숫자를 다시 int로 형변환하게 되면 마이너스 값이 나온다)
        용량 오버에 해당하는 현상을 미리 점검하기 위해 다운캐스팅 시에는 명시적(explicit)으로만 변형이 가능합니다.

        -> 현재는 기본 자료형을 기준으로 예시를 들었지만, 나중에는 참조자료형 캐스팅 개념과 연결됩니다. 추후 14번에서 설명
         */
         /*
         int가 21억 정도까지의 범위인데 더 큰 숫자로 표기하기 위해서는
         정수 기준으로 long -> SQL문에서는 그 와중에 long 이 아닌 bigint를 이요
          */



    }
}
