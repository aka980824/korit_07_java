package ch08_methods;

import java.util.Scanner;

/*
    점수를 입력 받아, 총합 및 평균을 내는 프로그램 작성
    //콘솔에 출력
    실행 예 ) 몇 과목의 점수를 입력하시겟습니까?
    1 과목의 점수를 입력하세요
    2 과목
    3 과목
    총합은 x 이며, 평균은 x입니다.
 */
public class ScoreCalc01 {
    public static void main(String[] args) {
        double sum = 0;
        int num0fSubs = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 과목의 점수를 입력 하시겠습니까? >>> ");
        num0fSubs = scanner.nextInt();

        for(int i=0;i<num0fSubs;i++){
            System.out.print((i+1) + "과목의 점수를 입력하세요 : ");
            int score = scanner.nextInt();
            sum +=score; //25~26 -> sum+=scanner.nextDouble로도 가능
        }
        avg = sum/num0fSubs;
        System.out.println("총합은 : " + sum + "이며, 평균은 : " + avg + " 입니다.");
    }
}
