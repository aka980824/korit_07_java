package ch08_methods;

import java.util.Scanner;

public class Method01 {
    // method를 정의하는 영역

    // 1. [ x | x ] [ 입력값 / 출력값 ]
    public static void call1() {
        System.out.println("[ x | x ]");
        System.out.println("same word");
    }

    // 2. [ o | x ]
    public static void call2(String example) {
        System.out.println("[ o | x ]");
        System.out.println("오늘의 다짐 : " + example);
    }

    // 3. [ x | o ]
    public static String  call3() {
        String example = "안녕하세요.";
        System.out.println("[ x | o ]");
        return example;
    }

    public static int casllAnd1() {
        int example = 1;
        System.out.println(example);
        return 1;
    }

    // 4. [ o | o ]
    public static double call4(double score) {
        System.out.println("[ o | o ]");
        System.out.println("해당 과목은 3점과목입니다. ");
        System.out.println(score);
        return score*3;
    }

    /*
        return이 있는 이유는 기본적으로 데이터의 조작을 위해서입니다. 그리고 특정 메서드 값이, 다른 메서드의 argument 로 사용될 수 있습니다.

       함수형 프로그래밍(Functional Programming)
       -> 메서드1의 return 값이 메서드2의 argument가 되고, 메서드2의 return 값이 메서드3의 argument가 되는 방식으로,

       첫 메서드로부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어지는 코딩 방식을 의미

       간단예시 하단 참고
     */

    public static String introduce(String name, int age){
        return "제 이름은 " + name + "이고, 나이는 "+ age + "살입니다 \n 내년에는 " + (age +1) + "살이 됩니다.";
    }

    
    public static void main(String[] args) {
        call1();
        call2("hello");
        call3();
        casllAnd1();

        //return 이용
        System.out.println(call3() + "!");
        System.out.println(casllAnd1()+1);

        System.out.println(" 학생의 성적은 : " + call4(4.5) + "점입니다. ");

        Scanner scanner = new Scanner(System.in);
        String myName;
        int age;
        System.out.print("이름 입력하세요 : ");
        myName = scanner.nextLine();
        System.out.print("나이를 입력하세요 : ");
        age = scanner.nextInt();
        System.out.println(introduce(myName,age)); // myName/age값을 우리가 정의한 introduice에서 argument로 사용하여 콘솔 출력하는 흐름
    }


}
