package ch12_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇명의 학생을 등록하시겠습니까? : ");
        int human = scanner.nextInt();
        int[] arr01 = new int[human];
        System.out.println(human + "짜리 배열 생성 성공!");
        /*
         1번 학생의 이름을 등록하세요 >>>
         ...
         5번

         2. scores 배열에 점수 입력
         1번째 학생의 점수를 입력하세요 >>>
         ...
         5번째

         학생들의 총 점수의 합은 x점입니다.
         */
        String[] name= new String[human];
        for(int i=0;i<name.length;i++){
            System.out.print((i+1)+"번째 학생의 이름을 입력하세요: ");
            name[i] = scanner.next();
        }
        double[] score = new double[human];
        double sum=0;
        for(int i=0;i<name.length;i++){
            System.out.print((i+1)+ "번 학생의 점수를 입력하세요 : ");
            score[i]= scanner.nextDouble();
            sum += score[i];
        }
        System.out.println("학생들의 총 점수의 합은 : "+sum);

        // [1],[3]에 해당하는 element만 출력하는 반복문을 작성하시오.
//        for (int i=0;i<human;i++) {
//            if (i==1 || i==3) {
//                System.out.println((i+1) + "번째 학생 이름: " + name[i]);
//                System.out.println((i+1) + "번째 학생 점수: " + score[i]);
//            }
//        }
        // index는 0부터 시작인데, 굳이 1로 지정해줘야하기 때문에 오히려 조건문이 있는
        // 것 보다 가독성이 떨어지고 잘못 해석될 가능성이 높음
        for(int i=0;i<name.length;i+=2){
            System.out.println((i+1) + "번째 학생 이름: " + name[i]);
        }
        //그래서 이상과 같은 코드라인 정도로 form에서 수정이 가해질 때에는
        for(int i=0;i< name.length;i++){
            if(i % 2==1)
            {
                System.out.println(name[i]);
            }
        }

    }
}
