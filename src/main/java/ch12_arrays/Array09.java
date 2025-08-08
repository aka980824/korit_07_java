package ch12_arrays;

import java.util.Scanner;

/*
    접근 지정자 public으로 method를 정의하였이게
    직접 정의한 Arry08의 메서드인 calc sum/avg를 arry09에서 활용가능
 */
public class Array09 {

    public static void main(String[] args) {
        Array08 array08 = new Array08();
        Scanner scanner =new Scanner(System.in);

        int[] nums = {1,2,3,4,5,6,7,8,10};
        //특정 클래스의 인스턴스에 딸려 있는 메서드 호출
        int sum = array08.calcSum(nums);
        double avg = array08.calcAvg(nums);
        int randomNum = scanner.nextInt();
        System.out.println(sum + "점");
        System.out.println(avg + "점");
    }
}
