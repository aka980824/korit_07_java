package collections;

import java.sql.Array;
import java.util.*;

/*
           1. 학생의 수를 입력 받아 해당 횟수만큼 반복문을 돌릴 것.
           2. 1번 ~ 5번 학생의 응답을 fieldTrips List에 저장할 것
           3. 중복을 제거하기 위하여 fieldTripSet에 이상의 List의 element들을 옮겨 담을 것
           4. 맨 마지막 출력문은 Set -> List로 재이동하여 finalFieldTrips List에서 element들을 추출하여 작성할 것.
           실행 예
           몇명의 학생이 수학 수행지를 입력하시겠습니까? 5
           n번 학생의 수학입력지를 이용하세요 : "제주" "제주""제주" "민속촌" "민속촌" "제주"

           아래 전체 출력
           1번 학생의 후보지 : x
           ...
           5

           중복제거
           수학여행의 후보지는
           제주
           민속촉
           입니다.

        */
public class FieldTrip {
    public static void main(String[] args) {
        Set<String> fieldTripsSet = new HashSet<>();
        List<String> fieldTripsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int a=0;
        System.out.print("학생 숫자를 입력하세요. : ");
        a = scanner.nextInt();
        scanner.nextLine();
        //List 객체 생성
        for(int i=0;i<a;i++){
            System.out.print((i+1)+"번 째 학생의 후보지를 입력하세요 : ");
            String place = scanner.nextLine();
            fieldTripsList.add(place);
        }
        System.out.println();

        for(int i=0;i<fieldTripsList.size();i++){
            System.out.println((i+1)+"번째 학생의 후보지 : "+fieldTripsList.get(i));
        }
        System.out.println();
        //하단의내용 > 중복제거
        fieldTripsSet.addAll(fieldTripsList);
        System.out.println("수학 여행지 후보");
        for (String place : fieldTripsSet) {
            System.out.println(place);
        }
        System.out.println("입니다.");

    }
}
