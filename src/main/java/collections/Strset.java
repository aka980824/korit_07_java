package collections;

import java.util.*;

/*
    List는 순서가 있고, 중복허용
    set의 경우 순서X/중복허용X
    List -> Set / Set -> List 형변환중요
    ex) List로 전체 설문을 받고, Set으로 중복제거후,
    후보군만 남기는 등의 형태로 많이 사용
    + Set으로 중복을 제거후 , 다시 List로 돌린 후, .get(indexNumber)로 조회가능
    즉 set은 집합개념과 유사
    다만, 집합은 숫자로만 이루어진 반면, set은 다양한 자료형을 기준으로 만들 수 있음

 */
public class Strset {

    public static void main(String[] args) {
        //Set 객체생성
        Set<String> strSet = new HashSet<>();
        //List 객체 생성
        List<String> strList = new ArrayList<>();
        //List/set에 element 추가방법은 동일 .add 이용
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("python");
        strList.add("python");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        System.out.println(strList);
        //중복 허용이라 전체출력 3/2/5/화

        //Set 추가예시
        strSet.add("TypeScript");
        System.out.println(strSet);

        //List의 값을 set에 대입
//        strList.addAll(strSet);
        strSet.addAll(strList);  // svo
        System.out.println(strList); // 원래 list유지
        System.out.println(strSet); // set에 element가 추가되긴했으나, 기존 typescript는 안사라짐 즉 값 4종류
        //현재 상황에서 예를 들어 set내부에 각 element를 추출하여
        System.out.println(strSet.size());
        // 뒤에 언어라고 붙여서 java언어 , 와 같이 데이터를 조작하는것이 불가능
        // 이상의 문제등을 이유로 set->list로 변환역시 자주쓰입니다.
        List<String> modifiedStrList = new ArrayList<>();
        modifiedStrList.addAll(strSet);
        //새로운 리스트 대입
        System.out.println(modifiedStrList);
        //set의 순서와 동일하게 들어갔기 때문에, 마찬가지로 순서가 보장 X
        Collections.sort(modifiedStrList);
        System.out.println(modifiedStrList);
        //54~55 순서 정리를 Collctions.sort를 이용하여 정렬
        
        //이제는 list니까 요소를 추출하여 뒤에 "언어"를 추가할수 있음
        /*
            실행예)
            react 언...
            type
         */
        System.out.println();
        for (int i=0; i<modifiedStrList.size();i++){
            System.out.println(modifiedStrList.get(i)+" 언어");
        }

        for (String a : modifiedStrList) {
            System.out.println(a + " 언어");
        }
        // 5명의 학생이 있다고 가정하고,
        // 5명에게서 "제주" "제주" "민속촌" "민속촌" "제주"
        // 전체출력 + 중복제외 출력


    }
}
