package ch23_lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("사과","딸기","블루베리");

        System.out.println(fruits);
        // 여기서저희는 각 element를 출력하기위해 for/향상 for이용

        //1. 일반
        for(int i =0;i<fruits.size();i++){
            System.out.println("과일명 : "+fruits.get(i));
        }
        System.out.println();
        //2. 향상 for
        for(String fruit : fruits){
            System.out.println("과일명 : "+fruit);
        }
        System.out.println();
        //3. 람다식
        fruits.forEach(fruit -> System.out.println("과일명 : "+fruit));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.println((number*2) + " "));

        //이상의 forEach
        // 이때까지 list등의 collection에서, 각 속성을 추출하여 데이터를 가공한다고 가정시  리스트 내부로 들어가는
        // 반복문을 필수적으로 작성해야했음

        // forEach()메서드에서는 메서드 '내'에 람다식으로 작성함으로
        // 읽을수만 있다면 가독성 있는 형태로 데이터를 가공가능

        //이상의 '메서드 내 람다식 적용'방식은 js/java를 이용하는 springboot 내부에서도 자주 사용
    }
}
