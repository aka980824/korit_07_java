package ch10_getter_setter.univ_student;
/*
    1. class 설계
        name / grade(1,2,3) / score(double)로 필드 정의
    2. 생성자
        1) 기본생성자
        2) 이름만
        3) 학년만
        4) 이름/학년
        5) 이름,학년,점수 생성자 정의
    3. Setter / Getter 메서드 정의 -> alt+insert
        각각의 필드에 대한 setter/getter 정의
        setter/getter 3개씩
        1) setGrade 범위 1~4
        2) setScore 범위 0.0~4.5
        를 벗어난 경우 불가능한 입력입니다. 가 출력되도록 비지니스 로직 작성
    4. UnivStudentMain
        student1 -> 기본생성자 김일/1/3.3

        student2 -> 기본생성자 김이/3/-30 -> 실패하고 4.0
        student3 -> 기본생성자 김삼/5 -> 실패하고 2/2.7
        student4 -> 기본생성자 김사/4/3.8
        student5 -> 기본생성자 김오/2/1.0
    5. 콘솔창
    이름: 김일
    학년 : x
    점수: x
    로 출력

*/


import java.util.Scanner;

public class UnivStudent {
    String name;
    int grade;
    double score;
    Scanner scanner = new Scanner(System.in);

    public UnivStudent() {
        System.out.println("기본 생성자");
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(double score) {
        this.score = score;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 5) {
            this.grade = grade;
        } else {
            System.out.println("불가능한 입력입니다.");
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 4.5) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.score = score;
    }

    void showInfo(){
        System.out.println("\n이름: "+name+"\n학년 : "+grade+"\n점수 : "+score);
    }
}
