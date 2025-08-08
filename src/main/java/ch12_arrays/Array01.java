package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr01 = {1,2,3,4,5};
//        int i=1;
//        System.out.println(i);
        System.out.println(arr01);

        //8번항의 경우 내부 값을 확인이 불가능함
        System.out.println(arr01[0]);
        System.out.println(arr01[1]);
        System.out.println(arr01[2]);
        System.out.println(arr01[3]);
        System.out.println(arr01[4]);

        for(int a=0;a<5;a++){                   // 5가 하드코딩되어있음-> literal그대로 사용 i가 어디에적용되는지 감안할 필요
            System.out.print(arr01[a]+"/");
        }

        for(int a=0;a<arr01.length;a++){    // arr01.length형태로 배열 내부의 데이터 개수가 달라져도 문제없음
            System.out.print(arr01[a]+"/");
        }

        "안녕하세요".length();

        //우리가 빌드를 참조시. 필드를 참조
        //bank1.accountHodler 같은 방식으로 참조가능
        //field를 직접 참조했다는 말은 length는 public

        // field를 length를 가지는 배열 생성
        int[] arr02 = new int[10]; // 10개짜리 비어있는 int형 자료를 가진 배열 생성

        // 이상의 모든것을 종합 했을 때,
        // 내부의 방의 개수/ 주소지의 한계값 -1 을 우리가 항상 아는것이 아니기에
        // element값을 출력하기 ㅜ이한 반복문의 한계값을 설정 시, 배열명 배열명.length를 이용할 것

        // arr01 내부에 있는 1~5는 arr01[0]~[04]까지의 변수명을 지니고 있음
        System.out.println("\n");
        arr01[0] = 10;
        System.out.println(arr01[0]);

        for(int i=0; i<arr02.length;i++){
                System.out.print(arr02[i]+"/");
        }
        System.out.println("");
        for(int i=0; i<arr02.length;i++){
            arr02[i]=21+i;
            System.out.print(arr02[i]+"/");
        }
        //arr02에 21~30 대입대어잇는데
        //42~44..50되입될수있도록 반복문 작성후 출력
        System.out.println("");
        for(int i=0; i<arr02.length;i++){
            arr02[i] *=2; // 42+2*i
            System.out.print(arr02[i]+"/");
        }
        System.out.println(""); // e란 자료형도 동일
        String[] strArray01={"안","녕","하","세","여"};
        System.out.println(strArray01[0]); //다른 자료형이여도 element추출절차는 동일

        //arry02

    }

}
