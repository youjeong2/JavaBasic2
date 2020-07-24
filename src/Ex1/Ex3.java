package Ex1;

// 3. 1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, ...
//위와 같은 수열의 30번째 항을 구하는 프로그램을 작성하시오.

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[30];
                arr[0] = 1;
                arr[1] = 1;
                arr[2] = 3;

        int sum = 0;

        for(int i =3; i<30; i++) {
             arr[i] = arr[i-3] + arr[i-1];
            if(arr[i]%2==0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
