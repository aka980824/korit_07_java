package ch15_casting.centralcontrol;

public class CentralControl {
    // 필드선언
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }
    
    // Method 정의
    public void addDevice(Power device){
        // Power의 자식 클래스에 해당하는 instance를 deviceArray 필드에 추가
        // CentralControlMain 에서 객체를 생성할 때, deviceArray의 최종 indexNumber는 고정되게 되는데
        // 다 들어차있는 배열에 덮어쓰시가 일어나서는 안되며(기존 element 삭제불가능)
        // 비어있는 element에 device를 추가하는 기능이 정의되어야함
        // 즉 필요한 기능이 배열내에 null 값으로 존재하는지 체크가 필요
        int emptyIndex = checkEmpthy(); // 메서드의 결과값을 변수 emptyIndex에 대입
        if(emptyIndex == -1){
            System.out.println("더이상 장치를 연결 할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device; // private으로 적용해두었기에, method를 경유
        System.out.println(device.getClass().getSimpleName()+" 장치가 연결되었습니다.");
        /*
         .getClass() -> class명을 return하는 메서드 즉 값을 불러들일때 사용하는  method + 패키지 경로 포함
         .getClass().getSimpleName() -> 경로제외
         현재 확인하면, method의 결과값을 가지고 다시 "."을 이용하여 다음 메서드를 호출하였는데
         이를 chaining method 라고 해서 return 값의 유형을 명확히 알고 있어야 그다음 어떤 method를 실행시킬지 확인가능
         */


        int count = 0;
        for (Power p : deviceArray) {
            if (p == null) count++; // 배열의 element가 null일 경우 count 증가
        }
        System.out.println("남아있는 연결 가능한 장치 수: " + count);
    }
    
    private int checkEmpthy() { // Method이지만, private히였음.
        //몇 개나 추가로 전자제품을 추가할수 있는지 체크하는 기능
        //i++니까 가장 빨리 만나게 되는 null값을 return
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null){
                return i; // 즉 배열 내부에 element가 없다면 그 주소지를 return
            }
        }
        return -1;
    }
    /*
        Java에서 index 넘버에는 음수 값이 존재하기 않기에, (python에는 마이너스인덱스 개념이 있음), 실패를 나타낼 때, -1을 사용하는 경우가 많음
        허나 0과 너무 가까운 숫자다보니, -100이나 return값으로 나올수 없을 만한 음수값을 지정하는 경우도있는데
        나중에 addDevice) 메서드에서, if(checkEmpty() == -89234)로 쓰고싶지않으면 -1이 보편적임
     */
    public void powerOn(){
        /*
        해당 클래스의 필드인 Power[] 배열안의  객체들은 기본적으로 Power의 서브클래스 객체이다.
        즉 on()/off() method를 공통적으로 가지고있음.
        그리고 Power 자료형으로 업캐스팅 되어있습니다.
         */
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null){
                System.out.println("장치가 없어 전원을 켜지 않음");
                continue;
            }
            // 즉시 종료되나 continue로 인하여 현재반복만 종료하고 다음 반복으로 넘어가는 것을 의미
            deviceArray[i].on();
        }
    }

    public void powerOff(){
        for(Power i : deviceArray){
            if(i == null){
                System.out.println("장치가 없어 전원이 꺼지지 않음");
                continue;
            }
            i.off();
        }
    }
    /*
        현재 배열 내의 각 객체들이 들어가 있는데
        .getClass().getSimpleName()를 이용시 클래스명만 출력되는것을 확인이 되는데
        deviceArray를 반복돌려 몇번 인덱스에 어떤 클래스가 있는지 표시하는 showInfo메서드 정의
        ex) 슬롯 [1] 번 : computer
            슬롯 [2] 번 : Led
     */
    public void showInfo(){
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null){
                System.out.println("슬롯 "+(i+1)+"번 : Empty" );
                continue;
            }
            System.out.println("슬롯 "+(i+1)+"번 : " + deviceArray[i].getClass().getSimpleName());
        }
    }

    // 각각의 고유 메서드를 실행할것이나, 논리적으로는 말이안댐
    public void performSpecificMethod(){
        for(Power device : deviceArray){
            if(device instanceof AirConditioner){ // 서브클래스가 잘못된 다운캐스팅을 하지않도록 하는 조건문
                AirConditioner airConditioner = (AirConditioner)device; //명시적 다운캐스팅
                airConditioner.changeMode();
            }else if(device instanceof Computer){
                Computer computer = (Computer)device;
                computer.compute();
            }else if(device instanceof LED){
                LED led = (LED)device;
                led.changeColor();
            }else if(device instanceof Mouse){
                Mouse mouse =(Mouse)device;
                mouse.leftClick();
            }else if(device instanceof Speaker){
                Speaker speaker =(Speaker)device;
                speaker.changeEqual();
            }else if(device == null){
                System.out.println("장치가 비어 있습니다");
            }else if(device instanceof  Printer){
                Printer printer=(Printer)device;
                printer.print();
            }else {                                             // 아직 instance 연산자를 통해서 조건문을 추가하지못한 class 및
                                                                // 추후 update를 통하여, 다른 기기를 지원할때는 } else사이에 elde if 추가하면 됨
                System.out.println("지원하지 않는 기기입니다.");
            }
        }
    }
}
// Printer 클래스 정의후 power interface를 implement
// 고유 메서드 print생성후, 프린터가 인쇄합니다. 출력
// Main에서 printer1 을 추가 및 om/off수행후
// print)_메서드도 centeralControl를통해 실행
