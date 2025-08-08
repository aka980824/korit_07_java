package ch11_access_modifier.bank;
/*
    가이드라인
    1. 필드
        accountNum(계좌번호,정수)
        accountHolder(예금주, 문자열)
        belance(잔액,정수)
        pinNumber(비밀번호,4자리 점수 0~9999)
        
    2. 생성자
        기본 생성자
        계좌번호만 있는
        계좌번호, 예금주 받는
        계좌번호, 예금주, 잔액 받는
        계좌번호,예금주, 초기잔액, 비밀번호
    3. 메서드
        getter/setter
            특히 Setter의 경우 유효성 검증 로직을 삽입해야 함
            -> 잔액은 음수일수 없음
            -> 비밀번호는 0이상 9999이하 까지만 가능 -> 실패시 "불가능한 비밀번호입니다.
        deposit(int amount, int inputPin) -> 입급관련 메서드 / call2() 유형으로 작성
            - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다" 하고 메서드 종료
            - 유효한 금액인지 검증(amount가 0초과인지) -> "불가능한 입력 금액입니다"
            - 콘솔창에
            000원 입급 성공! 현재 잔액 : 
                
        withdraw(int amount, int inputPin) -> 출급 관련 메서드 / call2()유형으로 작성
        - 유효한 금액인지 검증(amount 0초과) -> 실패시 "불가능한 입력금액입니다."\
        - 출금 후 잔액이 0이상인지 확인 -> 음수라면, "출금 불가입니다."
        - 콘솔 창에
            0000원 출금 성공 ! 현재 잔액 :0000원
        showAccountInfo() / call1()유형으로 작성
        - 콘솔창
            계좌 번호 : 123456
            계과 소유자 : 홍길동
            현재 잔액 : 100000원 이라고 출력할수 있도록 작성
            
            예)
            계좌 번호 : 123456
            계과 소유자 : 홍길동
            현재 잔액 : 100000원 이라고 출력할수 있도록 작성
            
            계좌 번호 : 987654
            계좌 소유자 : 신사임당
            현재 잔액 : 500000(50)
            
            50000이 입급되었습니다. 현재 잔액 : 15만            account1에 대한 입금
            잔액이 부족하여 출금할 수 없습니다. 현재잔액 : 20만   account1에서 200000원원 출금 시도 실패 사례(20만)
            
            100000원이 출금되었습니다. 현재 잔액 : 5000000     account2에 대한 출금(10출금
            20만원이 입금되었습니다. 현재 잔액 : 60만(숫자)      account2에 대한 입금(20입금
            
            최종계좌정보
            계좌번호 : 123456
            현재잔액 : 5만
            
            계좌번호 : 987654
            현재잔액 : 60만 
 */

public class Bank {
    private int accountNum;
    private String accountHolder;
    private int pinNumber;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if(pinNumber<0 || pinNumber>9999){
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }this.pinNumber = pinNumber;
        System.out.println("비밀번호가 정상적으로 입력되었습니다.");
    }

    public void deposit(int amount, int inputPin){
        if(pinNumber != inputPin){
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }if(amount<0){
            System.out.println("입력할 수 없는 금액입니다.");
        }else {
            balance += amount;
            System.out.println("\n"+amount + "원 입금이 성공 했습니다! 현재 잔액 : " + balance);
            this.balance=balance; //초기 잔액 세팅이기 때문에 입급은 예로 이러우질수 없습니다.
        }
        }

    public void withdraw(int amount, int inputPin){
        if(pinNumber != inputPin){
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }if(balance<amount){
            System.out.println("잔액을 초과하여 출금할 수 없습니다.");
            return;
        }
        else {
            balance -= amount;
            System.out.println("\n"+amount + "원 출금이 성공 했습니다! 현재 잔액 : " + balance);
            this.balance = balance;
        }
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int pinNumber, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.pinNumber = pinNumber;
        this.balance = balance;
    }
    public Bank(){

    }
    public void showInfo(){
        System.out.println("\n계좌 번호 : "+accountNum);
        System.out.println("계좌주 : "+accountHolder);
        System.out.println("잔액 : "+balance);

    }

}
