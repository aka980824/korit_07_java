package ch21_json;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    서점에서 판매하는 책 재고를 관리하는 프로그램
    지시사항
    1. Map을 이용하여 도서명을(String) key로, 재고를 integer로 하여 value 사용
    2. 사용자로부터 도서명과 수량을 입력받아 맵에 추가
        - 이미 존재하는 도서일 경우, "이미 재고에 있는 도서입니다"
    3. 사용자로부터 수량을 변경할 도서명과 새로운 재고 수량을 입력 받아 Map의 값을 '수정'
     - 존재하지 않는 도서라면 " 해당 도서가 재고에 없습니다. 출력"
    4.  Map에 있는 모든 도서명과 재고 수량을 출력하도록 작성

    실행 예
    --- 도서 재고 관리 프로그램 ---
    1. 도서추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 : 1
    새 도서명을 입력하세요 >>> 자바의 정석
    재고 수량을 입력하세요 : 10
    자바의 정석 도서가 10권 추가되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 : 2
    재고를 변경할 도서를 입력하세요 : 자바의 정석
    새로운 재고 수량을 입력하세요 : 9
    자바의 정석 도서가 9권으로 변경되었습니다.

    --- 도서 재고 관리 프로그램 ---
    1. 도서추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 : 3
    자바의 정석 - 10권

    --- 도서 재고 관리 프로그램 ---
    1. 도서추가
    2. 재고 수정
    3. 재고 목록
    4. 종료
    메뉴를 선택하세요 : 4
    종료되었습니다.
 */
public class BookMapV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , Integer> bookInventory = new HashMap<>();
        boolean endOfProgram = false;
        while(true) {
            System.out.println("--- 재고관리 프로그램 ---");
            System.out.println("1. 도서 추가 ");
            System.out.println("2. 재고 수정");
            System.out.println("3. 재고 목록");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int option = scanner.nextInt();
            scanner.nextLine();


        }

        }

}


