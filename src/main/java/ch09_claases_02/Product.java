package ch09_claases_02;
//ch_09_claases
/*
    1. Student 클래스의 필드를 정의
    int student String name double score
    2. 기본생성자를 정의하고, 객체 생성시,
        "기본 생성자로 객체를 생성하였습니다" 리고 출력되도록 코드작성
    3. int StudentCode를 매게변수로 하는 매개변수 생성자를 정의,
    int 매개변수 생성자로 객체를 생성했습니다. < 라고 출력
    4. String name를 매개변수로 하는 매개변수를 생성자로 정의 후,
    String 매개변수 생성자로 객체를 생성하였습니다 < 라고 출력
    5. studentCode, name을 매개변수로하는 매개변수 생성자를 정의 및
    int, String 매개변수 생성자로 객체를 생성했습니다 < 출력
    6. studentCode, name, score를 매개변수로 하는 매개변수 생성자를 정의 후
    int, String , double 매개변수 생성자로 객체를 생성했습니다 < 출력
    7. StudentMain 클래스에 해당 객체명과 속성명을 가질 수 있도록 작성
        1) student 2025001 / 김일 / 4.5 -> 기본생성자
        2) student 2025002 / 김이 / 100 -> int 매개변수 생성자
        3) student 2025003 / 김삼 / 95.8 -> String 매개변수 생성자
        4) student 2025004 / 김사 / 4.0 -> int, String 매개변수 생성자
        5) student 2025005 / 김오 / 80.7 -> int, String, double 매개변수 생성자

    8. 학생의 정보가 출력될수 있도록 하는 showInfo()메소드를 call1()타입으로 정의
    -> 실행예
        기본생성자로..
        int로..
        string...
        int, String...
        int, String, double...

        김일 학생의 정보입니다.
        학번 :
        이름 :
        점수 :

        김이... 학생의 정보입니다.
        ... 학생의 정보입니다.
        김오... 학생의 정보입니다.

 */
public class Product {
    int studentCode;
    String name;
    double score;

    public Product()
    {
        System.out.println("기본 생성자로 객체 생성");
    }

    public Product(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체 생성");
        this.studentCode = studentCode;

    }

    public Product(String name) {
        this.name = name;
        System.out.println("String 매개변수 생성자로 객체 생성");
    }

    public Product(double score) {
        this.score = score;
        System.out.println("double 매개변수 생성자로 객체 생성");
    }

    public Product(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
        System.out.println("int, String 매개변수 생성자로 객체 생성");
    }

    public Product(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
        System.out.println("int, String, double 매개변수 생성자로 객체 생성");
    }

    void showInfo(){
        System.out.println("\n" + name + "님의 학생의 정보");
        System.out.println("학번 : "+studentCode);
        System.out.println("이름 : "+name);
        System.out.println("점수 : "+score);



    }



}
