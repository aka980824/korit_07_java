package ch16_objects;

public class ObjectTest {
    // field 선언
    private String name;
    private String address;
    // 기본 생성자/ AllArgsConstructor 정의

    public ObjectTest(){
        return;
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }
    // getter/setter 정의

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // showInfo() call1()형식으로
    public void showInfo(){
        System.out.println("이름 : "+name);
        System.out.println("주소 : "+address);
    }
    /*
        실행 예
        이름 : 김땡땡
        주소 : 부산광역시 동구

        Main으로 가서, ObjectTest1 에 데이터를 set하고 showInfo호출
     */

    @Override
    public String toString() {
        return "이름 ='" + name + '\'' +
                "\n주소='" + address + '\'';
    }
}
