package Ex1;
// 1 ~10의 범위에서 3의 배수는 더한다.
// 3으로 나눠 나머지가 1인 숫자는 곱한다.
// 3으로 나눠 나머지가 2인 숫자는 뺀다.
// 각각을 연산하면 모두 더한 값을 계산하시오.

public class Ex5 {
    public static void main(String[] args) {
        int i = 0, sum = 0;

        for (i = 1; i < 10; i++) {
            if (i % 3 == 0) {
                sum += i;

            }
            else if (i % 3 == 1)
            {
                sum *= i;
            }
            else
            {
                sum -= i;
            }
        }
//        System.out.println("3의배수의 합 " + sum);
//
//        for (i = 1; i < 10; i++) {
//            if (i % 3 == 1) {
//                mult *= i;
//            } else {
//                continue;
//            }
//        }
//        System.out.println("나머지가 1인 숫자 곱한 값 " + mult);
//
//        for (i = 1; i < 10; i++) {
//            if (i % 3 == 2) {
//                sub -= i;
//            } else { continue; }
//        }
//        System.out.println("나머지가 2인 숫자 뺀값" + sub);

        System.out.println("연산값: " + sum );
    }
}





// ****
//public class Ex5 {
//    public static void main(String[] args) {
//        int i = 0, sum = 0;
//        int i2 = 0, mult = 0;
//        int i3 = 0, sub = 0;
//
//        for (i = 1; i < 10; i++) {
//            if (i % 3 == 0) {
//                sum += i;
//            } else {
//                continue;
//            }
//        }
//        System.out.println("3의배수의 합 " + sum);
//
//        for (i = 1; i < 10; i++) {
//            if (i % 3 == 1) {
//                mult *= i;
//            } else {
//                continue;
//            }
//        }
//        System.out.println("나머지가 1인 숫자 곱한 값 " + mult);
//
//        for (i = 1; i < 10; i++) {
//            if (i % 3 == 2) {
//                sub -= i;
//            } else { continue; }
//        }
//        System.out.println("나머지가 2인 숫자 뺀값" + sub);
//
//        System.out.println("연산값: " + sum + mult + sub);
//    }
//}