package ch02_variable;
/*
   주석(comment): Java 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링 하는데, 거기서 오류가 하나라도 발생하게되면 전체 프로그램이
   실행 X
   하지만 주석처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에, 오류가 발생하지 않습니다.

   즉 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라, 사람이 읽어서 정보를 얻을 수 있는 데에 의의가 있습니다.

   1) 한줄 주석 : //
   2) 다중 주석 : / + shift + 8 + enter
   3) 사후 주석 : 주석 처리할 부분의 코드 라인에 ctrl + /(Mac : command + /)

 */
public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요, 제 이름은 박제우입니다.");
//        System.out.println(안녕하세요 제 이름은 박제우입니다);
        System.out.println(1);
        System.out.println('1');
        System.out.println("1");
        /*
         이상과 같은 방식의 코드 대입을(매번 데이터를 직접 사용하는 방식) 하드 코딩이라는 표현을 합니다.
         하드 코딩 : 명령문에 데이터(변수에 대입되지 않은 데이터인데 이를 리ㅌ럴(Literal)를 바로 집어 넣는 것으로,
        '지양'되는 방식

        그렇다면 권장되는 방식은 ?  -> 데이터를 '변수'에 대입하여, 변수를 통해서 명령을 내리는 방식

        변수(variable) : 데이터를 담는 바구니 ->  이름을 달아줘야 함(변수지정)
        변수 선언 방법 :
        자료형 변수명 = 데이터;
         */
        int scoreEnglish = 100;                               // 변수선언 및 초기화
        System.out.println("scoreEnglish = " + scoreEnglish); //sout 출력문
        int koreanScore; //camelcase = 단어가 새로운단어가시작될때 첫글자를 대문자로 변경하는 규칙
        koreanScore = 99;

        String introduction = "안녕하세요, 저는 이번 국비 과정을 하고 있는 박제우입니다."; // 자료형
        System.out.println(introduction + "\n앞으로 잘 부탁드립니다.");

        /*
            Java에서의 변수 명령 규칙 :
            1. 카멜 표기법(camel case) 사용
                : 첫 문자는 소문자로 시작/ 복수의 단어로 이루어져 있는 경우 두번째 단어의 첫 번째 문자만 대문자
                ex) 한 단어 짜리 : result
                    복수 단어 : myTestResult
            2. 특수문자 지양

            cf) python 학습하신 분드르이 경우 python 변수 표기 방식은 스네이크 표기법(snake case)라고 해서
            my_test_result 와 같은 방식으로 사용
        */

        // 변수 - 값이 바뀔 수 있음
        scoreEnglish = 90;  // 재대입 할때는 자료형 명시 x
        System.out.println("scoreEnglish = " + scoreEnglish);

        // 자료형 수업
        // 1. 논리 자료형(boolean) 변수 : 참 / 거짓 (true / false)
        // 자료형 변수명 = 데이터(값);    <- 변수의 선언 및 초기화
        boolean checkFlag1 = false;
        checkFlag1 = true;  //재대입

        // 2. 문자 자료형(char) 변수
        char name1 = '박';
        char name2 = '제';
        char name3 = '우';
        System.out.println(name1 + name2 + name3); // 결과 값 : 150241
        System.out.println('박'+'제'+'우'); // 결과 값 : 150241
        System.out.println("name1~3 = " + name1 + name2 + name3); // 결과 값 : 글자

        /*
            이상의 코드에서 알 수 있는 점은 컴퓨터가 생각보다 멍청하다.
            개발자인 저희가 하나하나 지정을 해줘야 한다는 점입니다.
            '문자'와  '문자열'은 서로 다른 개념인데,
            문자(하나짜리)를 세번 더했을 경우에는, 더이상 문자가 아니라 문자열로 인식되기때문에 원하는 방식으로 출력되지 않습니다.
            ex_150~ 로 출력된것이 하나의 예시이다.

            그렇기 때문에, 68번 라인에서 scout() 중 () 내부에 ""를 넣어줌으로써,
            원하는 결과값을 얻을 수 있었습니다.

            즉 작은따옴표('')는 '문자'를 표시하기 위한 기호,
            큰따옴표("")는 "문자열"을 표시하기 위한 기호
            라고 알아두시면 되겠습니다.(근데 python이랑 JavaScript에서는 또 이런 구분이 없습니다.

            그리고, scout()의 () 내부에서 가장 먼저 나온 데이터의 자료형을 따라간다는 점도 확인할 수 있었습니다.

            현재 개념 : 하나짜리 문자가 여러 개 모이면 문자열
            char : 문자
            String : 문자열
         */
        char name4 = '백';
        String name5 = "이슬";

        System.out.println(123+1);  // result = 124
        System.out.println("123"+1);    //result = 1231
        System.out.println(123+"1");    //result = 1231 이지만 예외적

        // 3. 정수 자료형 변수(int)
        int width1 = 100;
        int width2 = 100;
        System.out.println(width1 + width2);
        String width3 = "300";
        String width4 = "400";
        System.out.println(width3 + width4);
        //문자열은 연산이 아니라, "나열"됩니다.

        //문자열은 '순서'가 중요합니다.
        Integer width5 = 500;
        Integer width6 = 600;
        System.out.println(width5 + width6); //근데 대문자로 시작하는 Integer가 있ㅅ브니다.

        // 4. 실수 자료형 변수(double)
        double pi = 3.1415926;
        System.out.println("pi = " + pi);
        // int pi = 3.14 -> 오류발생
        // 정수 / 실수 자료형은 수학 연산이 가능하다.
        /*
           + : 더하기
           - : 뻬기
           * : 곱하기
           / : 나누기
           % : 나머지

           pi 변수를 활용하여 원의 반지름이 43cm인 원의 둘레 및 넓이를 구하시오.

           둘레 : 2r*파이
           넓이 " r제곱 + 파이
         */
        double r = 43;
        System.out.println("둘레 = " + 2*r*pi);
        System.out.println("넓이 = " + pi *r*r);

        // 문자열의 경우 + 연산만 가능합니다.(실수형)
        String name = "안근수";
        String major = "영어교육과";
        String currentJob = "코리아 IT 아카데미 국비 교사";
        String previousJob = "영어교사";

        System.out.println(name);
        System.out.println(major);
        System.out.println(currentJob);
        System.out.println(previousJob);

        System.out.println("안녕하세요, 제 이름은 " + name + "입니다. 제 전공은 "+major+"이고, 그래서 제 예전 직업은 "+previousJob +
                "이었습니다. 현재는 " + currentJob + "를 가지고 있습니다. \n");

        // 이상의 코드에서 알 수 이쓴 ㄴ점은 변수 + literal 의 형태로도 작성이 가능하다는 점입니다.

        // 변수 선언
        String name10 = "박제우";
        String major10 = "컴퓨터소프트웨어공학부";
        String mbit10 = "INFP";
        int age10 = 28;

        /*
         위의 변수들에 수강자들의 데이터에 적합한 데이터로 '초기화'하여, 아래지문을 sout를 이용하여 작성
         */

        System.out.println("저는 코리아 IT  아카데미 7월 국비과정을 수강하고 있는 " + name10 + " 그리고 저의 나이는 " + age10 + "살 입니다. \n"
        + "제 전공은 " + major10 + "이며, MBTI는 " + mbit10 + "입니다. 잘부탁드립니다.");

        // \n -> 다움줄로 넘김
        // \t -> 탭 친 효과가 나타남.

        //ch01_operator 생성 후 Operator01클래스
    }
}
