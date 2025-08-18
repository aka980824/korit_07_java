package ch22_exception;
// extend Excpetion을 통해 예외처리 클래스 명시
public class InvaildAgeException extends Exception{
    // 사용자 정의 생성자
    public InvaildAgeException(String message){
        super(message);
    }

}
