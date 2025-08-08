package ch12_arrays;

public class Array08 {

    public int calcSum(int[] scores){
        int sum = 0;
        for(int i=0;i<scores.length;i++){
            sum +=scores[i];
        }return sum;
    }
    public double calcAvg(int[] scores){
        int sum = calcSum(scores);
        double avg = sum/ scores.length;
        return avg;
    }

    public static void main(String[] args) {
        Array08 array08 = new Array08();
        int[] scores = {100,97,55,24,49,60,20,77,89};

        // 이상의 예시 배열을 argument로 총합을 구하는 method  calcSum,
        // 평균을 구하는 calcAvg method를 정의하는데, call4() 유형으로 작성
        System.out.println("총합 : " + array08.calcSum(scores)+"점");
        System.out.println("총합 : " + array08.calcAvg(scores)+"점");
    }
}
