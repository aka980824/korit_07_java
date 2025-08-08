package ch15_casting.centralcontrol;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("전원이 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("전원이 꺼졌습니다.");
    }
}
/*
    프로그램 구현 사항
    interface Power를 implements한 다양한 클래스들을 정의할 예정
    ex) Computer/ AirConditioner / Speaker 전부 Power를 implement하게 되면 이상의 세 클래스들은
    강제적으로 on()/off() 메서드들을 ★★★ override 해야만 ★★ 합니다.
    -> Computer / AIrConditioner / Speaker 객체들을
    전부 Power로 업캐스팅
    Computer / AIrConditioner / Speaker 객체의 원래 클래스와 상관없이
    Power 클래스의 조작만드로 on/off 메서드를 호출하는 것이 가능

    즉 B b = new B();로 애초에 객체를 생성하게되지 않냐는 의문점이 생길 수 있으나 이전까지의 의문은
    A의 자식 클래스가 B하나 뿐일때에만 적용될수 있습니다.
    A의 자식 클래스가 B C D E F... 여러개가 있다고 가정하면
    그것을 업 캐스팅 했을때, A가 가지고 있는 부모 메소드를 호출함으로써, 다수의 서로 다른 클래스의 객체들을 통제할 수 있다는
    장점이 있습니다.
    그리고 다운캐스팅을 해서 각각 클래스의 고유 메서드도 실행이 가능
 */
