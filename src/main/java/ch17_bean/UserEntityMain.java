package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
//        UserEntity userEntity1 = new UserEntity(1,9876,"a@test.com","박제우");
        UserEntity user1 =new UserEntity();
        user1.setEmail("a@test.com");
        user1.setUsername(1);
        user1.setPassword(9876);
        user1.setName("박제우");

        System.out.println(user1);

        System.out.println(user1.getName());

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setName("김이");
        user2.setEmail("a@test.com");
        user2.setPassword(1234);
        user2.setUsername(2);

        System.out.println(user2);
        System.out.println("제이름은 : "+user2.getName());

    }
}
