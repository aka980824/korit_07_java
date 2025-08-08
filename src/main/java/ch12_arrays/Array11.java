package ch12_arrays;

public class Array11 {
    public static void main(String[] args) {
        String[] persons = {"김1","김2","김3","김4","김5"};

        /*
            실행 예
            1번 : 김일
            2번 : 김2
            ...
            라고 출력하도록 일반for/향상for이용
         */
        for(int i=0;i< persons.length;i++){
            System.out.println((i+1)+"번 : "+persons[i]);
        }
        int i=0;
        for(String person : persons){
            System.out.println((i+1)+"번 : " + person);
            i++;
        }
    }
}
