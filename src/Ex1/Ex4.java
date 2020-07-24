package Ex1;

import java.util.Scanner;

// 4. 피보나치 수열의 n번째 항을 구하는 프로그램을 작성하시오.

class Ex4 {
    public static void main(String[] args) {

        Scanner i3 = new Scanner(System.in);
        System.out.print("n번째 항을 입력하세요:");
        int num = i3.nextInt();

        long[] arr = new long[num];
        arr[0] = 1;
        arr[1] = 1;
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");

        for(int i=2;i<num;i++){
            arr[i] = arr[i-1] + arr[i-2];
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("n번째항 : " + arr[num-1]);
    }
}



//public class Ex4 {
//    public static void main(String[] args) {
//        int fibo = 1;
//        int fibo1 = 1;
//        int fibo2 = 1;
//
//        int fibo3 = 0;
//        Scanner tmp = new Scanner(System.in);
//        System.out.print("n 입력 : ");
//        fibo3 = tmp.nextInt();
//
//
//        for (int i = 0; i < fibo3; i++) {
//            if (i % 2 == 1) {
//                fibo1 = fibo + fibo2;
//                fibo = fibo1;
//                System.out.println(fibo);
//            }
//
//            if (i % 2 == 0) {
//                fibo2 = fibo + fibo2;
//                fibo = fibo1;
//                System.out.println(fibo2);
//            }
//        }
//
//        System.out.println("result : " + fibo);
//    }
//}