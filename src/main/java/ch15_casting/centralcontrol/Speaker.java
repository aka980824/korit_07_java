package ch15_casting.centralcontrol;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("스피커가 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("스피커가 꺼졌습니다.");
    }
    
    public void changeEqual(){
        System.out.println("스피커 이퀄라이저를 변경");
    }
}
        /*
        20250811 -> 고유클래스마다 고유 메서드를 정의
        power를 implement한 각 객체들은 업캐스팅이 이루어진 상태로, power의 field인
        deviceAraay에 속해져있음

        현재 점검 할 것은 고유 메서드를 실행
         */