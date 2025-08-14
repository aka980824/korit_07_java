package ch21_json;

import java.util.*;

/*
    모임 참석자 명단 관리 프로그램 작성
    지시 사항
    1. Set을 이용하여 참가자 명단을 저장(String) * 중복이름은 받지않습니다.
    2. 사용자로부터 참가자 이름을 계속해서 입력받을 예정
    3. 입력받은 이름을 set에 추가
    4. 종료라고 입력하면, 더 이상 이름을 입력받지 않습니다.
    ex) 실행 예
    --- 모임 참석자 명단 관리 ---
    참가자 이름을 입력하세요 >>> 김일
    참가자 이름을 입력하세요 >>> 김이
    참가자 이름을 입력하세요 >>> 김삼...
    참가자 이름을 입력하세요 >>> 종료
    프로그램이 종료되었습니다.

    --- 최종 참석자 명단 ---
    김일,김이,김삼
 */
public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> atteendees = new HashSet<>();
        List<String> meetingList = new ArrayList<>();

        System.out.println("--- 모임 참석자 명단 관리 ---");
        System.out.println("[ 종료 ] 를 입력하면, 프로그램을 종료합니다.");
        
        // name 변수의 데이터가 attendees가 추가되어야함 -> .add
        while (true){
            System.out.print("참석자 이름을 입력하세요 : ");
            String name = scanner.nextLine();
            if(name.equals("종료")){
                System.out.println("프로그램 종료");
                break;
            }
            atteendees.add(name);
        }
        System.out.println("\n--- 최종 참석자 명단 --- ");
        //set -> liest로 바꿔야함
        meetingList.addAll(atteendees);
        for(int i=0; i< meetingList.size();i++){
            if(i == meetingList.size() -1){ // meetingList.size() -1 은 리스트 마지막의 index넘버
                System.out.print(meetingList.get(i));
                break;
            }
            System.out.print(meetingList.get(i)+", ");
        }
        
    }
}
