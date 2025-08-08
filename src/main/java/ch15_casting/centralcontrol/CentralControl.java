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
        System.out.println("장치가 연결되었습니다.");

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
}
