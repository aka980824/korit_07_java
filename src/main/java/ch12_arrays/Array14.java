package ch12_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];

        // 1부터 100까지 2차배열에 값을 입력하세요
        int value =1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = value++;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for(int[] fistArray :nums){
            System.out.println(Arrays.toString(fistArray));
        }

        System.out.println(Arrays.deepToString(nums));
    }
}
