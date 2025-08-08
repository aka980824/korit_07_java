package ch08_methods;

import java.util.Scanner;

/*
    Method02에서 별찍기 관련 메서드를 생성했으나,
    질문을 Main에서가 아닌, 메소드 호출을 이용하여 기능 통합도 가능
 */
public class Method03 {
    public static String getStar(){
        String result = "";
        // method내부에서 외부 method를 가져오는것이 가능
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

        if(option ==1){//왼쪽치우짐
            for (int i=0;i<rows+1;i++){
                for (int j=0;j<i;j++){
                    result += "*";
                }
                result += "\n";
            }
        }else if(option == 2 ){ //오른쪽
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
        }else if(option == 3 ){//왼쪽치우져 감소
            for (int i=0; i<rows;i++) {
                for (int j = rows; j > i; j--) {
                    result += "*";
                }
                result += "\n";
            }
        }else if(option == 4 ){ //오른쪽으로 치우친 감소
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
        String starResult = "";
        starResult = getStar();
        System.out.println(starResult);
    }
}
