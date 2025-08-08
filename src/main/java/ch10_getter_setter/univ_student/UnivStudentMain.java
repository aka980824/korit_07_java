package ch10_getter_setter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent univStudent = new UnivStudent();

        UnivStudent univStudent1 = new UnivStudent();
        UnivStudent univStudent2 = new UnivStudent();
        UnivStudent univStudent3 = new UnivStudent();
        UnivStudent univStudent4 = new UnivStudent();
        UnivStudent univStudent5 = new UnivStudent();

//        univStudent1.name ="김일";
//        univStudent1.grade=1;
//        univStudent1.score=3.3;
//
//        univStudent2.name ="김이";
//        univStudent2.grade=3;
//        univStudent2.score=-30;
//
//        univStudent3.name ="김삼";
//        univStudent3.grade=5;
//
//
//        univStudent4.name ="김사";
//        univStudent4.grade=4;
//        univStudent4.score=3.8;
//
//        univStudent5.name ="김오";
//        univStudent5.grade=2;
//        univStudent5.score=1.0;

//        univStudent2.setScore(-30);
//        univStudent2.setScore(4.0);
//        univStudent2.showInfo();
//
//        univStudent3.setGrade(5);
//        univStudent3.showInfo();
        univStudent1.setName("김일");
        univStudent2.setName("김이");
        univStudent3.setName("김삼");
        univStudent4.setName("김사");
        univStudent5.setName("김오");

        univStudent1.setGrade(1);
        univStudent2.setGrade(3);
        univStudent3.setGrade(5);       // 현재는 로직 수정 x -> 그냥 들어갑니다.
//        System.out.println(univStudent3.getGrade());
        univStudent3.setGrade(2);
        univStudent4.setGrade(4);
        univStudent5.setGrade(2);

        univStudent1.setScore(3.3);
        univStudent2.setScore(-30);
        univStudent2.setScore(4);
        univStudent3.setScore(2.7);
        univStudent4.setScore(3.8);
        univStudent5.setScore(1);

        univStudent1.showInfo();
        univStudent2.showInfo();
        univStudent3.showInfo();
        univStudent4.showInfo();
        univStudent5.showInfo();

    }
}
