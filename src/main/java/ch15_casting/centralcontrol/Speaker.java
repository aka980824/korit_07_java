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
}
