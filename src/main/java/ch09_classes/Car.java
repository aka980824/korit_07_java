package ch09_classes;

public class Car {

    String color;
    int speed;

    //method
    void drive(){
        System.out.println(color + " 자동차가 주행중입니다. ");
    }
    void brake(){
        System.out.println(color + " 자동차가 멈췄습니다. ");
    }
    void displayInfo(){
        System.out.println(color + " 차 색상은 : "+color);
        System.out.println(color + " 차량 속도는 : "+speed);
    }

    //car인스턴스인 mycar생성
    //스피드에 160/빨강
    //yourcar객체 생성
    //color 노랑 속도180
    //mycar는 드라이브 호출 yourcar는 brake
    //2개 인포출력
}
