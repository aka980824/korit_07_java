package ch22_exception;

class LoginFailedException extends Exception{
    // 매개변수 생성자를 사용함
    public LoginFailedException(String message){
        super(message);
        System.out.println("예외 발생");
    }
}



public class Exception02 {
    public static void login(String id, String password) throws LoginFailedException{
        // 메서드 내에 지역변수 선언 및 초기화
        String correctId = "admin";
        String correctPassword ="1q2w3e4r";
        // 아이디/비번 일치 여부 확인
        if(!id.equals(correctId) || !password.equals(correctPassword)){
//            System.out.println("아이디 혹은 비밀번호를 확인 하세요.");
            throw new LoginFailedException("ID또는 PW가 틀렸습니다."); // "id또는 pw가 틀렸습니다"를
            // argument로 하는 loginfailedException 객체가 생성되었음
        }
    }

    public static void main(String[] args) {
        String inputId ="admin";
        String inputPassword ="1234qwer";

//        login(inputId,inputPassword); // 코드작성 순서 잘 기억
        //throw 키워드를 login에 넣어두었기 때문에 오류발생
        try{
            login(inputId,inputPassword);
        }catch (LoginFailedException e){// 자동완성으로 사용자 정의 예외처리클래스가 나왔는데, 그근거는 login메서드에 throw.. 작성했기 때문
            System.out.println("로그인 실패"+e.getMessage());
            // 이상을 실행 시, e.getMessage() 의 결과값이 "id또는 pw가 틀렷.."가 출력
        }finally {
            System.out.println("정상 종료");
        }
    }
    /*
        사실상 사용자 정의 예외 처리 방식 역시
        try/catch/finally * throws가 추가되었을 뿐이지
        메서드 정의/생성자정의/객체 생성방식은 이전까지의 코드작성와 차이X
     */
}
