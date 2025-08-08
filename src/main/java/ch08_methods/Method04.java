package ch08_methods;

import java.util.Scanner;

public class Method04 {

    public static String getStar(){
        String result = "";

        Scanner scanner = new Scanner(System.in);
        // Method02를 호출하여 메서드를 호출시 동일한 결과가기대
        int rows = 0;

        int option =0;
        System.out.print("몇 줄 짜리 별을 생성 할까요? : ");
        rows = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼으로 치우친 감소하는 별");
        System.out.println("4. 오른으로 치우친 감소하는 별");
        System.out.print("선택하세요 : ");
        option = scanner.nextInt();

        //switch으로 변환
        switch (option) {
            case 1:
                // 왼쪽으로 치우친 증가하는 별
                for (int i=0;i<rows;i++) {
                    for (int j=0;j<=i;j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2:
                // 오른쪽으로 치우친 증가하는 별
                for (int i=0;i<rows;i++) {
                    for (int j=0;j<rows-(i+1);j++) {
                        result += " ";
                    }
                    for (int k=0;k<=i;k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3:
                // 왼쪽으로 치우친 감소하는 별
                for (int i=0;i<rows;i++) {
                    for (int j=rows;j>i;j--) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 4:
                // 오른쪽으로 치우친 감소하는 별
                for (int i=0;i<rows;i++) {
                    for (int j=0;j<=i;j++) {
                        result += "*";
                    }
                    for (int k=rows;k>0;k--) {
                        result += " ";
                    }
                    result += "\n";
                }
            default:
                System.out.println("잘못 선택하셨습니다. ❤️");
        }

        return result;
    }



    public static void main(String[] args) {
        System.out.println(getStar());
    }
}
