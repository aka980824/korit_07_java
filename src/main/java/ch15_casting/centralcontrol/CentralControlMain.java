package ch15_casting.centralcontrol;

public class CentralControlMain {

    private static Power Led;

    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();
        Printer printer1 = new Printer();
        // 참조 자ㅓ료형의 배열을 생성(비어있는거)
//        Power[] powers = new Power[5];
        // 이하의 코드는 powers 생성하면서 indexNumber가 고정되기 때문에 예시만 보여주고 사용 X
//        Power[] powers = {new Computer(), new AirConditioner(), new Speaker()};

        // 그래서 저희는 centralControl 객체를 생성하여 내부의 필드에 비어있는 Power[] 배열을 집어 넣을 예정
        CentralControl centralControl1 =new CentralControl(
                new Power[6]
        );
        centralControl1.addDevice(computer1); // upcasting 발생 -> 명시하지않아도 이루어짐
        centralControl1.addDevice(airConditioner1);
        centralControl1.addDevice(speaker1);
//        centralControl1.addDevice(speaker1);
//        centralControl1.addDevice(speaker1);
//        centralControl1.addDevice(speaker1);
        System.out.println();
        LED led = new LED();
        Mouse mouse = new Mouse();
        centralControl1.addDevice(mouse);
        centralControl1.addDevice(led);

        centralControl1.powerOn();
        centralControl1.powerOff();

        System.out.println("-----countinue-----");
//        for(int i =0;i<10;i++){
//            System.out.print(i+1);
//        }
//        System.out.println();
//        for(int i=0;i<10;i++){
//            if((i+1)%2 != 1){
//                System.out.print(i);
//            }
//        }
//        System.out.println();
//        for(int i =0;i<10;i++){
//            if((i+1)%2 ==1){
//                continue;
//            }
//            System.out.println(i);
//        }

        centralControl1.showInfo();
        speaker1.changeEqual();
        centralControl1.performSpecificMethod();
        System.out.println();
        centralControl1.addDevice(printer1);
        centralControl1.powerOn();
        System.out.println();
        centralControl1.powerOff();
        centralControl1.performSpecificMethod();
    }
}
