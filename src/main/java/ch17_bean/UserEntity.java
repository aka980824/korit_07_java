package ch17_bean;

import lombok.Getter;

@Getter
public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;

    // 기본 생성자로 user1객체 생성
    // 메서드 정의
    /*
        username /1
        password /9876
        email / a@test.com
        name / 이름
        toString() 이용해서출력
        예)
            username : 1 \n email....... name : 이름
     */
    public UserEntity() {
        return;
    }

    public UserEntity(int username, int password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }



    public void setUsername(int username) {
        this.username = username;
    }
    public void setPassword(int password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "username : "+name+"\nemail : "+email+"\nname : "+name+"\n비밀번호는 보안 상 제공하지 않습니다.";
    }
}
