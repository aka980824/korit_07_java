package ch09_classes;

import java.util.Scanner;

/*

 */
public class ClassAMain {
    public static void main(String[] args) {
        //객체 생성
        ClassA classA1 = new ClassA();
        Scanner scanner = new Scanner(System.in);

        //객체를 호출
//        scanner.nextLine();
        //ClassA에서 선언된 변수들에 값을 대입
        classA1.num = 1;
        classA1.name = "박제우";
        classA1.score = 4.2;

        System.out.println(classA1.name + "학생의" +
                "학번은 " + classA1.num + "이며, 점수는 " + classA1.score + "입니다.");


        classA1.callName();
    }
}
