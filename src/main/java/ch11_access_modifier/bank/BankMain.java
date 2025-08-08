package ch11_access_modifier.bank;

public class BankMain {
//    예)
//    계좌 번호 : 123456
//    계과 소유자 : 홍길동
//    현재 잔액 : 100000원 이라고 출력할수 있도록 작성
//
//    계좌 번호 : 987654
//    계좌 소유자 : 신사임당
//    현재 잔액 : 500000(50)
    public static void main(String[] args) {
        Bank bank1 = new Bank(7897897,"홍길동",1234,100000);
        Bank bank2 = new Bank(5678,"신사임당",5678,500000);
        bank1.deposit(20000,1234);
        bank1.showInfo();

        bank2.withdraw(580000,5678);
        bank2.showInfo();

        System.out.println("\n 최종 계좌 번호");
        bank1.showInfo();
        bank2.showInfo();

        Bank bank3 = new Bank(1379,"아무나",-3000,89789);
        bank3.showInfo();
    }

}
