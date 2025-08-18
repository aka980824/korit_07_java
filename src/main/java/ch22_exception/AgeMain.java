package ch22_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeMain {
    // 예외 클래슨 별개로 정의 하였으나,
    // 매서드를 호출 했을때 예외를 처리해야하기 때문에, 여기에 추가적으로 메서드 정의가 필요(login() 참고)
    public static void checkAge(int age)throws InvaildAgeException{
        if(age < 0||age>200){
            //조건에 맞지 않는 경우, 예외처리
            throw new InvaildAgeException("나이는 0 ~200 사이의 정수만 가능");
        }

    }

    public static void main(String[] args) {
        // 사용할 클래스 import
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이 입력: ");
//        int age = scanner.nextInt();
        // 이부분에 바로 작성했으나, 여기 부분에 음수값이나,200초과정수를 집어넣을 수 있음 혹은
        // 자료형까지 가능
        // 예외처리가 발생할 가능성이 있는 부분을 try부분에 넣어주는게 중요
        try {
            int age = scanner.nextInt();
            checkAge(age);
            System.out.println("입력 나이는 : "+age+"살입니다");
        } catch (InvaildAgeException e) {
            System.out.println("나이 입력 오류 : "+e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
        }
        finally {
            System.out.println("정상종료");
        }
        /*
            이상의 코드에서 정상실행/비정상실행시
            콘솔 출력순서를 고려 예외처리가 발생하지않을경우. 정상실행 발생시 catch문 발생
            예외발생유무 관계없이 finally 실행
         */
    }
}
