package ch11_access_modifier;

class AccessModifierExample { //간판이되는 클래스는public class임 
    //필드 선언  -> 필드인데, 선언 및 초기화
    public int publicVar =10;
    protected int protectedVar =20;
    int defaultVar = 30;
    private int privateVar = 40;

    public int getPrivateVar() {
        return privateVar;
    }
}


public class Main {
    public static void main(String[] args) {
        //
        //객체 생성
        AccessModifierExample example = new AccessModifierExample();
        System.out.println(example.publicVar);
        System.out.println(example.protectedVar);
        System.out.println(example.defaultVar);
//        System.out.println(example.privateVar); //private 접근 지정자기에 오류발생
        System.out.println(example.getPrivateVar()+1); // 필드 직접호출이 아닌, getter를 통한 호출
    }
}
