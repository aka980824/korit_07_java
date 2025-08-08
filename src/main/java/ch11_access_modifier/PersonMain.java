package ch11_access_modifier;

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
    setter / getter default로 access modifier가 public이므로
    클래스 외부에서 사용 가능

    저희는 현재 객체 생성까지 완료한 상황에서
    getter/setter이용하여
    처음 이름을 "김일"로입력후 다시 "이일"로 수정하여 콘솔출력

 */
public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());
    }
}
