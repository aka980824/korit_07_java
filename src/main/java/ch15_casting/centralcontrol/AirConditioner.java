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
}
