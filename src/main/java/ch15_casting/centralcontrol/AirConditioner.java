package ch15_casting.centralcontrol;

public class AirConditioner implements Power{
    @Override
    public void on() {
        System.out.println("에어컨이 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("에어컨이 꺼졌습니다.");
    }

    //downcasting에 앞서 고유 메서드를 정의
    public void changeMode(){
        System.out.println("에어컨의 모드를 변경했습니다.");
    }

}
