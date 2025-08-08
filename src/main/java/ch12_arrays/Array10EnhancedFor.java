package ch12_arrays;
/*
    향상된 for 문(Enhanced For Loop)

    일반 for문과 차이 :
        일반 for문의 경우 imdex 넘버를 정확하게 알고 있어야하지만, 일일히 element의 숫자를 세는것이 번거롭기 때문에,
        arr01.length와 같은 방식으로 일종의 field 참조를 통해 int 값을 추출하여 대입해야했습니다.
        허나 for(inti=0;...)부분에서 int i 는 내부에서 선언하여, 내부에서만 사용이 가능

        이를 응용하기 위해 배열 내의 element에 for문 내부에서만 사용하는 변수에 대입하는 방식으로
        index 넘버의 사용없이 적용 할 수 있는 for 반복문이 있는데, 이를 향상된 for문

        제약 :
            일기만되고, 쓰시가 안됩니다.(1~100까지 추출은 가능하나, 집어넣는건 x
        형식 :
           for(자료형 변수명 : 반복가능객체(배열)){
            반복실행문
           }
 */
public class Array10EnhancedFor {

    public static void main(String[] args) {
        int nums[] = new int[200];

        // 1부터 200까지 배열
        for(int i=0;i<nums.length;i++){
            nums[i]=i+1;
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        // 일반 for문 형태로 1234....200출력
        for(int i=0;i<nums.length;i++){
            System.out.print((i+1)+" ");
        }
        System.out.println();
        // 향상된 for문
        for (int number : nums ){ // int num[]
            System.out.print(number + " ");
            // 첫 번째 반복에서 nums 첫번째 element 1을 number대입
            // number =1;이 된상황 *37번라인
            // 대입이 된 상태로 38번 라인을 실행시킵니다. "1"까지 출력
            // 그다음 반복으로 넘어가 대입....
            // 37->38번 반복하다가. 마무리
            // 이후 반복문 외부에서는 number사용 X
        }
        // String 형태의 김일,김이,김사,김사,김오 라는 속성을 가지도록 작성후, 일반 for문으로 이름출력
        // 향상된 for문으로 출력
        System.out.println();
        String names[] = {"김일","김2","김3","김4","김5"};
        for (int i =0;i< names.length;i++){
            System.out.print(names[i]+" ");
        }
        System.out.println();
        for(String name : names){
            System.out.print(name + " ");
        }

    }
}
