package ch09_claases_02;

public class ProductMain {

    public static void main(String[] args) {
        //객체 생성 방법 클래스명  = 객체명
        //기본생성자를 통한 생성
        Product product1 = new Product();
        product1.studentCode = 2025001;
        product1.name = "김일";
        product1.score=4.5;
        //매개변수 생성자를 통한 생성...
        Product product2 = new Product(2025002);
        product2.name="김이";
        product2.score =100;

        Product product3 = new Product("김삼");
        product3.studentCode=2025003;
        product3.score = 94.8;

        Product product4 = new Product(2025004, "김사");
        product4.score=4.0;

        Product product5 = new Product(2025005,"김오",84);

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
        product5.showInfo();

    }
}
