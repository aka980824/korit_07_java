package ch_08_methods;

import java.util.Scanner;

/*

 */
public class Method02 {

    // call4() 유형으로 작성 예정. -> 몇줄짜리인지/ 어떤 유형의 별찍기인지 main에서 받을 예정
    public static String getStar(int rows, int option) {
        String result = "";
        // 이 사이에 별 찍기 관련 로직 들어갈 예정

        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row0fStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.print("몇 줄 짜리 별을 생성 할까요?");
        row0fStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼으로 치우친 감소하는 별");
        System.out.println("4. 오른으로 치우친 감소하는 별");
        choice = scanner.nextInt();

        starResult = getStar(row0fStars, choice);

        System.out.println(starResult);
        
        /*
        나머지 8.01 작성 예정
         */
    }
}
