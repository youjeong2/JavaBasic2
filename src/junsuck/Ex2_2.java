package junsuck;

// 상수와 리터

public class Ex2_2 {
    public static void main(String[] args) {
        // 변수는 저장된 값을 변경 가능선
        // 지역변수는 선언과 동시에 초기화
        int score = 100;
        score = 200;

        //상수는 한번만 값을 저장가능, 다른 값 저장시 오류가 난다.
        // literal : 그 자체로 값을 의미 = 200
        final int score2 = 100;
        // score 2 = 200;
        System.out.println(score2);

        // 선언과 초기화를 따로 할 수 있음
        int score3;
        score3 = 200;

        System.out.println(score);
        System.out.println(score3);


    }

}

