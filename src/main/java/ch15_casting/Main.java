package ch15_casting;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();

        Animal animal1 = dog1; // Upcasting #1
        //예시
        int a = 1;
        System.out.println(a);
        dog1.makeSound();
        dog1.fetch();
        System.out.println();
        animal1.makeSound(); // 결과값 : 강아지가 공을 물어옵니다. 즉 재정의된
        //method가 호출됨
//        animal1.fetch(); -> 오류발생

        Animal animal2 = new Dog(); // A a = new B(); 형태 -> 시험에 자주 나옴

        animal2.makeSound(); // result : 개가 짖습니다.
//        animal2.fetch(); -> 불가능
        /*
            클래스A 객체명  = new 클래스B(); 를 통해 객체를 생성했을 때,
            1. Override가 적용된 메솓ㄷ, 즉 자식 클래스의 메서드가 호출
            2. 클래스B의 고유 메서드는 호출 불가능

            재정의된 method 버전으로 호출이 될거라면,
            클래스B 객체명 = new 객체명B();로 생성시 재정의된 method/고유 method
            호출이 가능하니, 골치 안아픈것 이아닌가?
            -> X
        */
        Animal animal3 = new Animal();
        animal3.makeSound(); //소리냅니다.

        // 연산자 instanceof 사용 사례
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1); //true

        boolean result2 = animal2 instanceof Animal;
        System.out.println(result2); //true
        // 44항. 업캐스팅이 이루어지지 않고 Dog dog1 = new Dog();로 만든 객체
        boolean result3 = dog1 instanceof Animal;
        System.out.println(result3); //true
        boolean result4 = animal2 instanceof Dog; //true
        // animal3의 경우 Animal animal3 = new Animal();로 작성하여서 검증 필요
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5); // true
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6); // false

        System.out.println("↑ 업캐스팅 파드 - 객체명.메서드명(); 했을 때 재정의 버전이 나오는가 아닌가에 주목");
        System.out.println("↓ 다운캐스팅 파트");
        /*
            다운캐스팅은 '명시적'으로 이루어져 있음
            방법->
            (클래스명)객체명; -> (int)2,3 와 같은 방식 conversion의 객체 버전
            그래서 기본 자료형의 형변환에서 벗어나서 참조 자료형 까지 고려
         */

        Dog dog2 = (Dog) animal2;
        // 다운캐스팅 방법 -> Animal animal2 = new Dog(); 로 생성해서 dog2 객체명은 X
        dog2.makeSound();
        dog2.fetch();
        // dog2로 새로운 객체명을 선언하고, 거기에 명시적 참조 자료형 캐스팅을 작용하여
        // Animal 클래스의 인스턴스인 animal2를 downcasting했습니다
        // 결과 makesound() 호출은 변함이없고, fetch()호출이 가능
        // 여전히 B b = new B()로 생성시 귀찮을 리 없지 않나 라는 의문생성

//        Dog dog3 = (Dog) animal3; // downcasting과정에서 오류발생
//        dog3.makeSound(); // 고로 아래도 오류발생
        /*
            71번 라인에서 오류가 발생
            즉 애초에 animal3를 생성시, animal1 클래스의 생성자를 호출하여 만들었기 때문에,
            (A a = new A() < 이기 때문)
            하위 클래스의 인스턴스로 다운캐스팅 하는 것이 불가능

            위 오류를 해결하기 위해서는 아래와 같습니다.
         */
        Animal animal4 = new Dog();
        //형태로 선언된 클래스와 호춣되는 생성자가 서로 달라야합니다.(그리고 둘은 상속관계여야함)

        //그렇기에, 현재 코드라인에서 빨간 줄이 발생하지도 않앗기에, 다운캐스팅이 이루어졌는지
        //도 확인이 불가능하고 이를 해결하기위한것이 instanceof입니다.

        System.out.println("animal4 검형");
        if (animal4 instanceof Dog) {
            Dog dog4 = (Dog) animal4;
            dog4.makeSound();
            dog4.fetch();
        }
        System.out.println("\nanimal3는 다운캐스팅 안되는것을 확인 했으니 추후 다운캐스팅 시도");
        if (animal3 instanceof Dog) {
            Dog dog3 = new Dog();
            dog3.fetch();
            dog3.makeSound();
        }else {
            System.out.println("불가능 다운캐스팅");
        }

        // ch15_casting에 새파일
    }


}


