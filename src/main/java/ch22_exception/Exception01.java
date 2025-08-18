package ch22_exception;

import java.util.Scanner;

/*
    예외(exception)이란?
        : 개발자가 예측이 가능하며, 그에 대해 대비할 수 있는 것들을 예외라고 정의
    오류(eroor)
        : 개발자가 예측할순있지만, 해결할수 없거나 예측할수 업는 것을 오류

        exception01에서 알수 있듯, 다수의 예외처리는 이미 개발자들이 정의해놓았음(로그확인)
        예를 들어 List를 하나 정의하여 element를 집어넣었다고 가정시,
        그 경우 List의 속성들을 추출하기 위한 반복문을 이용할 것인데,
        i < strList.size를 이용하지 않고, i<3001 과 같은 방식으로 처리했을시, 발생(하드코딩)

        향상된 for문을 이용시, 이러한 오류 방지
 */
class Person{
    int age;
    String name;

    void showInfo(){
        System.out.println("나이 : "+age);
        System.out.println("이름 : "+name);
    }
}

public class Exception01 {
    public static void main(String[] args) {
        Person person1 =new Person();
        person1.age=20;
        person1.name="김일";
//        person1.school="코리아아이티";
        person1.showInfo();






//        int a= 10;
//        int b= 0;
//        int result = a/b;
//        System.out.println(result);

        /*
            고전적 형태의 예외 처리 방식 -> if이용
         */
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (b==0){
//            System.out.println("나눌 수 없습니다.");
//        }else {
//            System.out.println("결과값은 : " + (a/b));
//        }
        /*
            예외 처리를 적용한 방식의 코드 -> try/catch/finally
         */
//        int a=10;
//        int b=0;
//        try {
//            int result = a/b; //AritchemticException 예외 발생 -> 35번 라인이 아니라 catch로 넘어감
//            System.out.println("결과 : "+result);
//        }catch (ArithmeticException e){
//            System.out.println("0으로는 나눌 수 없습니다."+e.getMessage());
//        }finally {
//            System.out.println("프로그램 정상 종료");
//        }
        int[] numbers= {1,2,3};
//        System.out.println(numbers[5]); // 예외처리 발생구간
        try {
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            throw new RuntimeException(e);
        } finally{
            System.out.println("프로그램 정상 종료");
        }
        /*
            이상의 코드 라인에서 중요한 점은 catch문이 복수로 나올 수 있음
            저희가 if문에 대해서 작성시,
            조건의 순서를 배치하는 것이 매우 중요합니다.
         */
    }
}
