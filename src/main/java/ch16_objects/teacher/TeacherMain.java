package ch16_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("박제우","부산고등학교");
        Teacher teacher2 = new Teacher("박제우","부산고등학교");

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);
        // 이상코드에서 중요한건 재정 전/후 결과값이 다르다
        // 티쳐에서 equals()재정의전 false가 떴음
        // 그떄의 경우는 teacher1/2의 주소지까지 확인항녀 동일판단을했다면 재정이후 데이터를 동일한지 체크했기때문
        System.out.println(teacher1);
        System.out.println(teacher2);

        Class tClass = teacher1.getClass();
        System.out.println(tClass);// class ch16.teac..
        System.out.println(tClass.getSimpleName()); //Teacher
        System.out.println(teacher1.getClass().getSimpleName());  //teacher

        Field[] fields = tClass.getDeclaredFields();
        System.out.println(fields);
        for(int i=0;i< fields.length;i++){
            System.out.println("필드명 출력 : "+fields[i].getName());
            System.out.println("패키지명 + class 명 : "+fields[i].getType());
            System.out.println("class 명 : "+fields[i].getType().getSimpleName()+"\n");
        }
        // 향상된 for문으로 작성
        for(Field field : fields){
            System.out.println("필드명 출력 : "+field.getName());
            System.out.println("패키지명 + class 명 : "+field.getType());
            System.out.println("class 명 : "+field.getType().getSimpleName()+"\n");
        }

        Method[] methods = tClass.getDeclaredMethods();
        for(int i=0;i< methods.length;i++){
            System.out.println("메서드 명 출력 : "+methods[i].getName());
            System.out.println("리턴 타입 출력 : "+methods[i].getReturnType() + "\n");
        }
        
        //새로운 객체 생성시 주의사항
        ch16_objects.Teacher teacher3 = new ch16_objects.Teacher("박제우","코리아아이티");

        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2); //false

//        System.out.println(teacher3 instanceof Teacher);
        // 오류발생 teacher3의 자료형은 ch16_.object.teacher이지 ch16.teacher.teacher가아님
    }


}
