package ch21_json;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        // 속성(키-값) 을 추가하는 메서드 ->addProperty() 메서드
        jsonObject1.addProperty("username",1);
        jsonObject1.addProperty("password",1234);
        jsonObject1.addProperty("email","a@test.com");
        jsonObject1.addProperty("name","김일");
        jsonObject1.addProperty("score",4.5);

        System.out.println(jsonObject1);
        /*
           Map과의 차이는
           1. Map에서는 키에 ""가 없었으나, JSON에서는 모든 key에 자료형으로 보이도록 "" 사용
           2. Map에서는 key1=value1 형태이지만 json -> "key1":value 형태
         */
        jsonObject1.addProperty("job","학생");
        System.out.println(jsonObject1);
        /*
            컴퓨터가 콘솔에 출력한 형태는 길게 늘어져있음
            그래서 가독선 개선방법으로도 출력을 하기도함
            컴퓨터가 읽기편한게아닌, 사용자가 읽기에 적합한형태로 이용시
            pretty printing이라는 표현사용
         */
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // jsonObject1을 위에 대입
        String jsonData = gson.toJson(jsonObject1);
        System.out.println(jsonData);
    }

}
