package junsuck;

// 리터럴의 타입과 접미사

public class Ex2_3 {
    public static void main(String[] args) {
        // 문자
        char ch = 'a';
        // 문자열
        String str = "ABC";
        byte b = 127;
        // byte c = 128;

        int i = 100;
        int oct = 0100;
        int hex = 0x100;

        long l = 10_000_000_000L;
        long l2 = 100; // 20억 이하로  int의 범위 내 이므로 L생략가능

        float f = 3.14f;
        double d = 3.14; // d는 생략가능
        // double이 float보다 범위가 더 크면
        // 변수와 리터럴의 타입이 불일치 해도 대입가능
        double d2 = 3.14f;
        // int 값 100이 byte의 범위(-128~127)에 속해서 대입가능
        byte b2 = 100;
        // byte b2 = 128; 127은 범위 벗어나서 오류남


    }
}
