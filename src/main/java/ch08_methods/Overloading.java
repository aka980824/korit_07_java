package ch08_methods;
/*
    method Overloading
        매개변수의 유무 및 자료형의 차이, 개수의 차이를 나눠서 동일한 메서드 명을 지는 메세드들을 정의할 수있다.

        즉, 메서드 명은 동일하고, 매개변수에 들어가는 자료형, 갯수를 달리하게 되면
        서로 다른 메서드로 받아들입니다.

        overloading 장점 :
        동일한 기능을 하는 메서드를 정의할 때, 메서드 명이 필요한데
        예를 들어 String 자료형끼리 연결해주는 메서드와 int끼리의 합 연산
        을 하는 메서드를 나눈다고 가정하였을 때, add, plus, connect등 의 메서드를
        정의 했다면 다음 합 연산을 하는(예를 들어 double 형태)메서드 명을 정하는 것이 번거롭다.
        이러한 부분의 해결을
        public void add(String example1, String example2) {
            로직
        }

        public void add(int example1, int example1){
            Rozic
        }
        또는
        public void add(String example1, String example2, String example3){
            로직
        }
        와 같은 방식으로 메서드 명을 동일하게 가져가면서 차이를 둘 수 있다.

 */
public class Overloading {
    // Method 정의 영역
    // call1()
    public static void add(){
        System.out.println("add()");
    }
    //overloading 적용
    //call2 유형으로 정의
    public static void add(String s){
        System.out.println("add(String s)");
        System.out.println(s + "!");
    }

    //call2 유형으로작성2
    public static void add(int a, int b){
        System.out.println("add(int a, int b"); //위 2문장은 오버로딩임 해당메소드를 불러와서 아래내용을 도출하는 것이기 때문
        System.out.print(a+b);
    }
    
    public static void add(int a, String s){
        System.out.println("add(int a, String s");
        System.out.println(a + " / " +  s);
    }

    public static void add(String s, int a){
        System.out.println("add(String s, int a");
        System.out.println(a + " / " +  s);
    }

    public static void add(int a, int b, double c){
        System.out.println("add(int a, int b, double c");
    }

    public static void main(String[] args) {
        // Method  호출 영역
        add();
        add("안녕하세요");
        add(2,2);
        add(3,"개졸리다");
        add("dsadad",121);
    }

}
