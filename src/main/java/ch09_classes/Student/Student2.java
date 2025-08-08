package ch09_classes.Student;

public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }
    // 메뉴탭-> 코드 ->생성
    // alt+insert
       
    
    public Student2(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
    }

    public Student2(String name) {
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.name = name;
    }

    public Student2(double score) {
        System.out.println("double 매개변수 생성자로 객체를 생성했습니다.");
        this.score = score;
    }

    public Student2(int studentCode, String name) {
        System.out.println("int, studentCode 매개변수 생성자로 객체를 생성하였습니다.");
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student2(int studentCode, String name, double score) {
        System.out.println("int, String , double 매개변수 생성자로 객체를 생성했습니다.");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }
    void showInfo() {

        System.out.println("\n"+name + " 학생의 정보입니다.");
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score );
    }
}
