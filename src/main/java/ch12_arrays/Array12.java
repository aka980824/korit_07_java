package ch12_arrays;

import ch08_methods.Method01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/*
    배열의 출력
    엄밀히 말하면, 배열을 출력한게 아닌 배열에 저장된 element값을 출력함
    sout를 이용해 작성시,
    주소값만 나온다는 사실 확인 가능

    근데 element 값을 조정하거나, 더하거나와 같은 추가적인 가공을 하기 위해서 for 반복문을
    사용했으나. 굳이 변형이 없고 배열 자체를 확인할때마다
    메인 안에 반복문작성이나 메소드정의는 번거로움

    Array 클래스를 이용하여, 정적 메서드인 toString을 이용시 배열 전체가 출력이 가능

    클래스명.메소드()라는점을 주의
    scanner.nextLine()과는 다릅니다.
    toString을 곧 사용
 */
public class Array12 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Random sc =new Random(); // 이러지마세요 (하드코딩)

        int num1 = random.nextInt();
        System.out.println(num1);
        System.out.print("숫자를 입력하세요 >>>");
        int num2 = random.nextInt();
        System.out.println(num2);

        // int배열에 1~10까지대입
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(numbers));

        Method01.call1();
        System.out.println(Method01.call3());

        Integer[] nums = {3,6,7,1,9,2,10,5,4,8};
        System.out.println("정렬전 배열 : "+Arrays.toString(nums));

        // 오름차순
        Arrays.sort(nums);
        System.out.println("오름차순 정렬후 배열 : "+Arrays.toString(nums));
        // 내림차순
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println("배열 : "+Arrays.toString(nums));
        /*
            이상의 경우를 보면 sort메서드에 오름차순에서는 argument가 하나였으나, 내림차순은 2개
            이상의 과정이 overloading을 통해 이루어져 있음을 확인이 가능
            2번째 argument로 Comparator.reverseOrder() 가 사용되었는데, 이를
            함수형 프로그래밍의 일종이라고 볼수있음
            Comparator.reverseOrder()사용하기 위해서는
            기본자료형(원시자료형/ primitive type) int[]배열을 사용할수 없기에
            Integer[] 배열을 사용하였는데,
            현재로써는 char -> String 처럼 int ->Integer로 생하면 좋음
         */
    }
}
