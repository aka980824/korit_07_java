package ch15_casting.centralcontrol;

public class LED implements Power {
    @Override
    public void on() {
        System.out.println("Led 전원이 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("Led 전원이 꺼졌습니다.");
    }
    
    public void changeColor(){
        System.out.println("조명의 색깔 변경");
    }
}
