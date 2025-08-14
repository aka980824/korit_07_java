package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 하나는 한줄로 출력
        // 하나는 prettyPrint 이용
        // 1. java object
        /*
            1. user1 객체 생성후, kim1/9876/a@test.com/김일/20 의 필드갑을 가지도록
            json1.java파일을 참조하여, json데이터로 바꿔보시오

         */
        User user1 =new User("kim1","9876","a@test.com","김일","20");
        String jsonUser = gson.toJson(user1);
        System.out.println(jsonUser); // 한줄 출력
        String jsonUser2 = gsonBuilder.toJson(user1);
        System.out.println(jsonUser2); // pretty printing 적용
        /*
            2. Map -> json변환
            productMap1 생성후, "production","HYWM3KH/A"
            "productName", "아이폰 16 프로 맥스"
            로 만드시오

            Map 이 key-value entry 값을 가지고 있으므로
            json의 property로 일대일 대응이 가능
            하지만 아직 메서드를 배우지 않앗기 때문에, map만 생성
         */
        Map<String,String>productMap1 = new HashMap<>();
        productMap1.put("production","HYWM3KH/A");
        productMap1.put("productName", "아이폰 16 프로 맥스");
        //Map->json 변형
        String jsonProduct1 = gson.toJson(productMap1);
        System.out.println(jsonProduct1);
        String jsonproduct2 = gsonBuilder.toJson(productMap1);
        System.out.println(jsonproduct2);

        /*
         이상의 두 차례에서 tojson이라는 메서드는 argument로 java object 자체를 집어넣는것도 가능하며
         map 으로 생성된 엔트리를 json형태로 바꾸는 것도 가능하다.
         즉, tojson()은 overloading이 이루어졌다고 할 수 있음

         gson 객체에서도 toJson() 이 있고, gsonbuilder 에서도 tojson이 있다는점 또한 주의

         Json--> Map /java object로 바꾸는 방식도있음
         String data인 json을 "" 포함해서 쓰는게 너무 귀찮기 때문에,
         user1과 productMap1을 json으로 바꾼 데이터를 사용

         형식
         gson.fromJson(제이슨데이터, 바꾸고자하는_클래스명.class);
         */
        User user2 =gson.fromJson(jsonUser2, User.class);
        System.out.println(user2);
        Map<String , String>productMap2 = gson.fromJson(jsonproduct2, Map.class);
        /*
            gsonBuilder로 fromJson()을 적용하더라도 콘솔 상에
            prettyPrinting 이 적용되지 않음
            결과값 :
            1열로 출력의 이유는 fromJson()이라는 메서드명에서 알 수 있듯이,
            jsonData를 Map으로 바꾸는 것을 의미
            String의 경우에는 개행을 통해서 prettyPrinting 이 적용될 수 있지만,
            Map은 toString() 메서드를 재저으이 하지않으면 default 형태로 콘솔에 출력이됨
            그래서 gson.fromJson()이든 gsonBuilder.fromJson() 이건 콘설에 찍히는 결과값은 동일하다는 것을 의미
         */

        /*
            특정 자바객체와 json string data가 있다고 가정시, 서로 왔다갔다하며 고칠 수 있음
            Map/Json데이터 역시 동일
         */
        System.out.println();
        Map<String,String >userMap1 = gson.fromJson(jsonUser2, Map.class);
        System.out.println(userMap1);
        /*
            그렇다면 이상의 코드처럼 자바 객체로 만든 것을 json 으로 바꾼이후, map형태로 바꿀수있음
            하지만 Map의 경우 Json으로 바꾸는 것까지는 자유지만, 걔를 java로 바꿀시 클래스가 정의되어야함
            객체는 클래스라는 설계도를 기준으로 만들어지는 거기 때문이다.

            JSON -> jsonObject로 바꿀예정
            즉 json=/= jsonObject 라는 뜻이 됨
            잘 생각해보시면 jsonUser1을 선언시, 자료형을 String으로 잡았습니다.
            그렇다면 javaScript의 자료형은 무엇인가요?
            ->
         */
        JsonObject jsonObject1 = gson.fromJson(jsonUser, JsonObject.class);
        System.out.println(jsonObject1);
        JsonObject jsonObject2 = gsonBuilder.fromJson(jsonUser,JsonObject.class);
        System.out.println(jsonObject2);

    }
}
