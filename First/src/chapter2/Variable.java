package chapter2;

public class Variable {
    public static void main(String[] args) {
        // 자바의 정수 자료형 4가지
        // byte (1바이트)
        // short (2바이트)
        // int (4바이트)
        // long (8바이트)
        byte b1 = 1;
        short b2 = 2;
        int b3 = 3;
        long b4 = 4;

        // 문자 자료형
        // char (2바이트)
        char ch1 = 'A';
        System.out.println(ch1);

        // 실수 자료형
        // float (4바이트)
        float fnum = 3.14F;
        // double (8바이트)
        double dnum = 3.14;

        // 논리 자료형
        // boolean (1바이트)
        boolean isTrue = true;

        // 자료형 없이 변수 선언하기
        // 두가지 조건 1. 지역변수로만 가능 2. 한번 초기화한 자료형으로만 사용가능
        var num = 10;
        var dNum = 10.0;
        var styr = "hello";
    }
}
