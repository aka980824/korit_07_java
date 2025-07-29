package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 변수 선언
//        String name;
//        name = "박제우";
//        System.out.println(name);
        // 아래 객체의 생성에는 매우 중요한 문단이나, 이후 수업에서 예정
        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>>> ");
//        name = scanner.nextLine();
//        System.out.println("입력한 이름은 " + name +"입니다.");
        /*
            1. println 과 print의 차이
                ln = line new -> println으로 실행하면 출력문이 다 나오면 자동으로 개행이 됨
                print로 작성할 경우에는 동일 라인에 그대로 연결됨.
            2. nextline / nextInt / 이런것들이 있으므로, 구별 필요
         */
//        System.out.print("연도를 입력하세요 >>> ");
//        int year = scanner.nextInt();
//        System.out.println("입력한 연도는 " + year + "입니다.");
//        System.out.print("이름을 다시 입력하세요 >>>");
//        name = scanner.next(); // 입력시 띄워쓰기 이용 ex) bak Esul
//        System.out.println(name); // 출력값 -> 앞의 bak만 출력
        /*
           2. next(Int / Double, ... etc) vs nextLine
            - nextLine은 띄워쓰기를 허용합니다. enter 키, 즉 개형을 기준으로 데이터가 변수에 저장됩니다. 그래서 결과값이 bak
            - 나머지는 허용 안합니다. 띄워쓰기하면 잘려서 대입
         */
//        System.out.print("올해는 몇 년도 일까요? >>> ");
//        int year = scanner.nextInt();
/*        System.out.print("당신의 이름은? >>> ");
        String name = scanner.nextLine();
        이상 코드의 문제점은 34 번 라인이 실행 시, 데이터를 입력하지 않고 바로 넘어갑니다.
        왜 이런 문제가 생기냐면 nextInt()에서 값을 입력하고 저희가 enter를 치게되는데, 그경우 다음 nextLine에서는
        enter키를 받아들여서 빈값인 상태로 enter를 쳤다고 인지 되기 때문에 넘어갑니다.

        해결 방안 : enter 키를 받아주는 nextLine()를 하나더 생성
*/
//        scanner.nextLine();
//        // 위 문장은 사용되지 않을 거기 때문에, 변수에 대입X
//        System.out.print("당신의 이름은? >>> ");
//        String name = scanner.nextLine();
//
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name);
        /*
        1. 다음과 같이 콘솔에 출력 될수 있도록 코드 작성
        나이 입력하시오 >>> 19
        저는 올해 19 살입니다
        내년에는 20살이 됩니다.

        2. 당므과 같이 코드 작성
        점수를 입력하세요 >>> 4.5
        이름을 입력하세요 >>> 이슬
        이슬 학생의 점수는 4.5입니다.
         */

//        System.out.print("나이를 입력 하세요 >>> ");
//        int age = Integer.parseInt(scanner.nextLine());
//        System.out.println("저는 올해 " + age + "입니다." );
//        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");
        System.out.print("나이 입력 >>> ");
        int age = scanner.nextInt();
        System.out.println("저는 올해 " + age + "입니다.\n내년에는 " + (age+1) +"살이 됩니다." );

//        System.out.print("점수를 입력하세요. >>> ");
//        double score = scanner.nextDouble();
//        System.out.print("이름을 입력하세요 >>>");
//        String name = scanner.next();
//        System.out.println("\n" + name + " 학생의 점수는 " + score + "입니다.");

        System.out.print("점수 입력 >>> ");
        double score = scanner.nextDouble();
        System.out.print("이름 입력 >>> ");
        String name = scanner.next();
        System.out.println("\n" + name + " 학생의 점수는 " + score + "입니다.");


    }
}
