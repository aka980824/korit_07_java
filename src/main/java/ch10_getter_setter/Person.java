package ch10_getter_setter;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("기본 생성자 매개변수");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("\nage = " + age);
        System.out.println("name = " + name);
    }
    /*
        setName 메서드 안에 비지니스 로직을 추가
        1. argument 로 들어온 String 데이터를 글작수로 파악하여
        2. 4글자 초과라면 "변경할 수 없습니다" 를 출력 한 후 메서드를 종료
        3. 4글자 이하라면 "이름이 변경되었습니다."
        4.              "변경 전 이름 : 변경 후 이름 : 출력"
        5. 가되도록 작성하여, PersonMain에서 Person1의 이름을 변경하시오
        6. main에서의 코드라인
        7. person1.setName("노마드코더")


     */
    public void setName(String title) {
        int nameL = title.length();
        if(nameL<0 || nameL>4){
            System.out.println("변경할 수 없습니다.");
            return;
        }else {
            System.out.println("이름이 변경되었습니다.");
            System.out.println("변경 전 이름 : " + name);
            this.name = title;
            System.out.println("변경 후 이름 : " + title);
        }

    }
    public void setAge(int birth) {
        if (birth < 0 || birth > 100) {
            System.out.println("불가능한 나이 입력입니다.");
            return; // method 에서 return은 method 즉시 종료 키워드입니다
            // 즉 이 이하로는 아에 실행되지가 않음
        } else{
            System.out.println("변경 전 나이 : " + age); // birth 대입 전
            this.age =birth;
            System.out.println("변경 후 나이 : " + age); // 대입 후니까 동일한 코드라도 다른 결과
        }
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    // ch10_getter_setter내부에 univ_student

}
