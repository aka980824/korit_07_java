package ch09_classes;
/*

 */
public class Constructor {
    int num;
    String name;

    //기본 생성자 정의 -> 원래 기본적으로 만들어짐
    // 매개변수의 유무만 있고. return이 없기에, call1()유형에 해당 및 클래스명과 동일한 생성자 명을 가짐
    Constructor(){
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    //매개변수 생성자 정의 -> 기본적으로 만들어지는게 아닌, 개발자가 직접 정의
    //매개변수 생성자가 아니더라도, 만들어질 경우 default로 만들어진 기본 생성자가 사라지기
    //때문에, 생성자와 매개변수 생성자를 둘 다 사용하고 싶으면 '명시적으로 정의'가 필요
    Constructor(int number){
        System.out.println("RequiredArgsConstructor(매개변수 생성자)");
        this.num = number; // this : 해당 클래스에서 객체를 생성하게 되면 객체 이름으로 대체가 됨
        System.out.println(number);
    }

    // String title를 매개변수로 하는 생성자를 정의하고
    // RequiredArgsContructor(String  매개변수를 필수로 요구하는 생성자) 라는 안내문을 출력할수 있도록
    // 작성후, ConstroctorMain으로 가서 constructor3이라는 객체명을 지니고, title에 여러분이름으로
    // 자어 객체를 생성후 sout를 이용하여 출력

    Constructor(String title){
        System.out.println("RequiredArgsContructor(String  매개변수를 필수로 요구하는 생성자)");
        this.name = title;
        System.out.println("constructor3.title = " + title);
        
    }

}
