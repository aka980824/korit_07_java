package ch08_methods;

import java.util.Scanner;

public class ScoreCalc02 {
    //method 정의 영역
    //call()유형으로 작성
    public static void calcSumAndAvg(){
        Scanner scanner = new Scanner(System.in);
        int num0f;
        double avg=0, sum=0;
        System.out.print("몇 과목의 점수를 입력하시겠습니까? : ");
        num0f = scanner.nextInt();
        for(int i=0;i<num0f;i++){
            System.out.print((i+1) +"번째 과목의 점수를 입력하세요 : ");
            sum += scanner.nextDouble();
        }
        avg = sum/num0f;
        System.out.println("과목의 총 점수 : "+ sum +"이며, 평균 : "+avg +"입니다.");
    }


    public static void main(String[] args) {
       //메서드 호출 영역
        calcSumAndAvg();
    }
}
