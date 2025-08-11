package ch17_bean;

import lombok.Data;
//하단에 에너테이션 @을달면 class level
@Data
public class UserEntityLombok {
    //여기에 달면 field level
    private int username;
    //여기에 @Setter를 달면 password에만 setter가됨
    private int password;
    private String name;
    private String email;
}
