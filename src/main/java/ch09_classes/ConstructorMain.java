package ch09_classes;

import java.util.Scanner;

public class ConstructorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 기본생성자를 통한 객체 생성
        Constructor constructor1 =new Constructor();
        // int 매게변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(3);
        // 여기에서, number : 1에 해당하는 것은 argument
        // new Constructor(1) 를 ctrl + enter를 누르면 매게변수 생성자로넘어감
        // 이동된 부분에서, (int number)부분을 매개변수라고 부름(parameter)
        // 8번 라인의 객체를 생성하게 됐을 때, argument로 들어간 1이라는 int data는
        // 매개변수 생성자를 통해 int number=1; 로 초기화되며
        //sout에서 constructor2.num = number가 대입된것
        Constructor constructor3 = new Constructor("박제우");
        System.out.println(constructor3.name);

        System.out.print("이름을 입력하시오 : ");
        String title = scanner.nextLine();
        Constructor constructor4 = new Constructor(title);
        System.out.println(constructor4.name);
    }
}
