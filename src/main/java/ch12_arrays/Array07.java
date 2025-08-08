package ch12_arrays;

public class Array07 {

    public static void main(String[] args) {
        int[] score = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;


        //int[] =/= int
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 87) {
                a++;
            } else if (score[i] > 79) {
                b++;
            } else if (score[i] > 69) {
                c++;
            } else if (score[i] > 59) {
                d++;
            } else {
                f++;
            }
        }
        System.out.println("A 학점의 학생 숫자 : " + a);
        System.out.println("B 학점의 학생 숫자 : " + b);
        System.out.println("C 학점의 학생 숫자 : " + c);
        System.out.println("D 학점의 학생 숫자 : " + d);
        System.out.println("F 학점의 학생 숫자 : " + f);
        System.out.println();
        // 어짜피 변수 abcdf가 하나하나  int니까 인트배ㅔ열 선언해서 선언 변수 갯수를 줄일수잇지않을까요?
        int[] grades = {0, 0, 0, 0, 0};
        //A에 해당할경우, grade[0}, b-> grade[1]....f
        //로할경우 다섯줄을 써가며 변수를 선언 X
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 87) {
                grades[0]++;
            } else if (score[i] > 79) {
                grades[1]++;
            } else if (score[i] > 69) {
                grades[2]++;
            } else if (score[i] > 59) {
                grades[3]++;
            } else {
                grades[4]++;
            }

        }
        System.out.println("A 학점의 학생 숫자 : " + grades[0]);
        System.out.println("B 학점의 학생 숫자 : " + grades[1]);
        System.out.println("C 학점의 학생 숫자 : " + grades[2]);
        System.out.println("D 학점의 학생 숫자 : " + grades[3]);
        System.out.println("F 학점의 학생 숫자 : " + grades[4]);
    }
}
