package ch14_abstraction.interfaces;

public class ModeChangeButton extends Button{
    private boolean status;
    @Override
    public void onPressed(){
        if(status) {
            status = false;
            System.out.println("난방 모드로 전환되었습니다.");
        } else {
            status = true;
            System.out.println("냉방 모드로 전환되었습니다.");
        }
    }
}