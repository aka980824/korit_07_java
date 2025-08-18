package ch23_lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                System.out.println("hello, java");
            }
        }; // 객체정의기에 ;필수
        runnable.run();

        Runnable lambdaRunnable = () -> System.out.println("hellow! java");
        lambdaRunnable.run();

        // 다른 유형의 함수형 인터페이스 실행예제
        // 2. supplier -> call2()
        Supplier<String> stringSupplier = () -> "hello, Supplier";
        System.out.println(stringSupplier.get());
        String message = stringSupplier.get();
        System.out.println(message);

        //3. Consumer -> call2()
        Consumer<String> stringConsumer = (memo) -> System.out.println("메세지 : "+memo);
        stringConsumer.accept("오늘 전반적인 수업은 여기서 끝입니다.");


    }
}
