package interfaceex;

// interface는 모든 메서드가 추상메서드가.
// 그래서 실제 인스턴스로 사용하지 않고 클래스 혹은 프로그램이 제공하는 기능을 명시적으로 선언하는 역할을 한다.
public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;
    // public static final int ERROR 로 변환이 된다.

    int add(int num1, int num2);

    int substract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    // 디폴트 메서드, 인터페이스를 상속한 클래스에서 오버라이딩 가능.
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
    }

    // 정적 메서드, 클래스를 생성하기 전에도 자유롭게 사용가능.
    // ex) Calc.total([1,2,3]) // 6
    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        return total;
    }
}
// 이런식으로 인터페이스는 추상 메서드와 상수만으로 이루어진다.