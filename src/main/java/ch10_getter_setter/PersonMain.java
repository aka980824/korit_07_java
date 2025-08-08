package ch10_getter_setter;

public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.age=-10;
        person1.name="김일";

        Person person2 = new Person("김이");
        person2.age = 201;

        Person person3 = new Person(20);
        person3.name = "김삼";

        Person person4 = new Person("김사",54);

        person1.showInfo(); person2.showInfo(); person3.showInfo(); person4.showInfo();

        //Setter / Getter 사용법 > method라고 했음
        // 즉, 메서드 호출 방법 이용
        System.out.println(person1.getName());
        person1.setName("디카프리오");
        person1.name="김일";
        person1.name="디카프리오";
        System.out.println(person1.getName());
        System.out.println(person1.name +"\n");
        // Setter/ Getter를 통해서만 데이터의 입력/수정/조회가 가능하게하고
        //필드에 직접 값 대입하는 방식을 막을 예정

        person4.setAge(789);    // 결과값 불가능한 나이입력
        System.out.println(person4.age); //  결과값 54-> 기존나이 출력
        person4.age=789;        //필드에 직접 대입
        System.out.println(person4.age); //결과값 789

        // 이상과 같은 코드 라인은 특정 방법을 이용하면 부정확한 데이터의 입력이 가능하다
        // 그렇기 때문에, 장기적으로 볼 때 method를 통한 데이터의 입력/ 수정/ 조회가 필요

        // .length -> String 자료형의 글자 수를 return 하는 메서드
        person1.name.length();
        System.out.println(person1.name.length());
        // .. 가 여러개 나오는 방식을 chaining 이라고 한다.
        // 위와 같이 작성하기 싫어하시는분은 중간에 변수를 선언하는 분도있음.
        String person1SName = person1.getName();
        System.out.println(person1SName.length());
        System.out.println("\n");

        person1.setName("노마드코어");
        person2.setName("이일");
    }
}
