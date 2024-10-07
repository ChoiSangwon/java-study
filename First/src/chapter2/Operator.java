package chapter2;

public class Operator {
    public static void main(String[] args) {
        // = 대입 연산자
        // 이항 연산자 중 가장 우선순위가 낮음
        // 좌측에 우측을 대입할때 사용
        int age = 24;

        // +,- 부호 연산자
        // 합,차를 구하는 이항 연산자이자 부호를 나타내는 단항 연산자
        int num = 10;
        System.out.println(+num); // 10
        System.out.println(-num); // -10
        System.out.println(num); // 10

        num = -num;
        System.out.println(num); // -10

        // 산술연산자
        // + - * / %
        // 흔히 아는 사칙연산 + 나머지 구하기

        // 증가 감소 연산자
        // ++ --
        int val;
        val = ++num; // 먼저 num이 +1 된 후 val 변수에 대입
        val = num++; // val 변수에 num 대입 후 num 값 +1

        val = --num; // 먼저 num 값이 1 감소한 후 val 변수에 대입
        val = num--; // val 변수에 기존 num 값을 먼저 대입한 후 num 값 1 감소

        // 관계 연산자
        // > < >= <= == !=

        // 논리 연산자
        // && || !

        // 복합 연산자
        // += -= *= /= %= <<= >>= >>>= &= |= ^=

        // 조건 연산자
        // 조건식 ? 결과1 : 결과2
        int fatherAge = 45;
        int motherAge = 47;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';

        System.out.println(ch); // T

        // 비트 논리 연산자
        // & ^ | ~

        // 비트 이동 연산자
        // << >> >>>
        // >>> 시프트 연산자는 >> 연산과 동일하게 비트를 오른쪽으로 이동하는데, 왼쪽에 채워지는 비트 값이 부호 비트와 상관없이 무조건 0이
        // 된다.

    }
}
