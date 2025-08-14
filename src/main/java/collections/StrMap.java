package collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String,String> strMap1 = new HashMap<>();

        // Map에 key - value 쌍 삽입 -> ,put(키 ,값 )
        strMap1.put("kor2025001","김일");
        strMap1.put("kor2025002","김이");
        strMap1.put("kor2025003","김삼");
        strMap1.put("kor2025004","김사");
        strMap1.put("kor2025005","김오");
        // 입력한 순서대로 출력되지는 않습니다.
        System.out.println(strMap1);
        // key  하나당 value는 하나이다. 즉 키가 값으면 value는 가장 최근걸로 덮어쓰기합니다.
        strMap1.put("kor2025005","kimfive");
        System.out.println(strMap1);
        /*
            list의 경우 순서가 있기 때문에, 기본적으로 index를 통하여 조회가 가능하나,
            Map의 경우 순서가 보장되지않아 .get("키값")을 통해 조회가가능
         */
        System.out.println(strMap1.get("kor2025001")+" 님");

        Map<String, Double>scores= new HashMap<>();
        scores.put("김일",52.2);
        scores.put("김이",46.2);
        scores.put("김삼",100.0);
        scores.put("김사",58.1);
        scores.put("김오",91.2);
        System.out.println(scores);
//
//        Map<String, Double[]>scores2= new HashMap<>();
//        scores2.put("김일",new Double[2]); // 이런자료구조도 가능하나, 복잡함

        //특정 key value 수정
        // #1. key에는 value가 하나밖에 없어 덮어쓰기하면댐.
        scores.put("김오",77.7);
        System.out.println(scores);

        // #2 .replace()
        scores.replace("김오",41.8);
        System.out.println(scores);
        /*
            두가지 방법이 있는 이유는 .put()은 없는 키라면 키생성후, 삽입이가능하나
            replace는 키값이 없을경우 실행이 X
         */

        // 특정 key의 존재 여부 -> containsKey(); -> boolean
        boolean searchKeyFlag = strMap1.containsKey("김육");
        System.out.println("김육 학생의 존재 여부 : "+searchKeyFlag);

        // 특정 키의 존재여부 -> containsValue -> boolean
        boolean searchValueFlag2 = strMap1.containsValue("김삼");
        System.out.println("김삼 존재 여부 : "+searchValueFlag2);

        // Map의 엔트리보부터 생성
        Set<Map.Entry<String,String>> entrySet1 = new HashSet<>();
        // 이상의 코드는 set하나 만드는데, 내부의 키가 string/value인 map이 통채로 들어감
        Set<Map.Entry<String,String>> entrySet2 = strMap1.entrySet();
        // 이상의 코드는 strmap1의 key-value 쌍을 set로 바꾸는 메서드인 .entryset()의 호출결과를
        // entryset2 변수에 담았음을 의미.
        System.out.println(strMap1);
        System.out.println(entrySet2);
        System.out.println();

        List<Map.Entry<String,String>> entryList1 = new ArrayList<>();
//        List<Map.Entry<String,String>> entryList2 = strMap1.entrySet();
        // Map-> list로 직접변환이 불가능

        entryList1.addAll(entrySet2);
        System.out.println(entryList1); // list로 바꾸었기에 element 출력이가능
        // 이상까지의 과정에서 Map -> Set -> List로 바꾸는 과정을 코드로 작성했는데
        // Map -> List 로 바로 가는게 가능한지 여부를 따질 필요 O -> 69~70 체크

        // .sort() 가능 및 추출도 가능

        // Ket Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);

        // value set
//        Set<String> valueSet = strMap1.values(); -> 불가능한 이유? 키는 중복이안되서 가능하나, value는 중복이되기때문에 위험함
        Collection<String> values = strMap1.values();
        System.out.println(values);
        // collction 자료형은 처음 사용  .sort() 는 Collections
    }

}
