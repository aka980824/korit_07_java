package ch08_methods;

import java.util.Scanner;

/*

 */
public class Method02 {

    // call4() 유형으로 작성 예정. -> 몇줄짜리인지/ 어떤 유형의 별찍기인지 main에서 받을 예정
    public static String getStar(int rows, int option) {
        String result = "오늘 하루도 힘냅시다  ❤️\n";
        // 이 사이에 별 찍기 관련 로직 들어갈 예정
        // 주의사항 : sout가 아닌 return 타입이 고정되어 있음
        // -> 로직을 그대로 가져오지만 sout로 출력해서는 안됨
        if(option ==1){
            for (int i=0;i<rows+1;i++){
                for (int j=0;j<i;j++){
                    result += "*";
                }
                result += "\n";
            }
        }else if(option == 2 ){
            for(int i=0;i<rows;i++) {
                // 공백: 줄 번호만큼 공백 출력 (0부터 시작)
                for(int j=0;j<rows-(i+1);j++) {
                    result += " ";
                }
                // 별: i+1개 출력
                for(int k=0;k<i+1;k++) {
                    result += "*";
                }
                result += "\n";
            }
        }else if(option == 3 ){
            for (int i=0; i<rows;i++) {
                for (int j = rows; j > i; j--) {
                    result += "*";
                }
                result += "\n";
            }
        }else if(option == 4 ){ //오른쪽으로 치우친 감소별
            for(int i=0;i<rows;i++){
                for(int j=0;j<i+1;j++){
                    result +="*";
                }for(int k=rows;k>0;k--){
                    result +=" ";
                }
                result += "\n";
            }
        }else {
            result = "해당 기능이 없습니다.";
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row0fStars = 0;
        int choice = 0;
        String starResult = "";

        System.out.print("몇 줄 짜리 별을 생성 할까요? : ");
        row0fStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼으로 치우친 감소하는 별");
        System.out.println("4. 오른으로 치우친 감소하는 별");
        System.out.print("선택하세요 : ");
        choice = scanner.nextInt();

        starResult = getStar(row0fStars, choice);

        System.out.println(starResult);
        
        /*
        나머지 8.01 작성 예정
         */
    }
}
