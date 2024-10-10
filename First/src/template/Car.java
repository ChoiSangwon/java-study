package template;

public abstract class Car {
    public abstract void drive();

    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // 템플릿 메서드 (디자인 패턴 중 하나)
    // 미리 정의된 시나리오를 최상위의 클래스가 가지고 있고, "final" 키워드를 사용해서 하위 클래스가 바꿀 수 없게 만든다.
    // 로직 흐름이 이미 정해져 있는 프레임워크에서 많이 사용하는 기법.
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }

}
