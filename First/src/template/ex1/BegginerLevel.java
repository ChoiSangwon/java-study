package template.ex1;

public class BegginerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("jump할 줄 모르지롱.");
    }

    @Override
    public void turn() {
        System.out.println("turn할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("=====초보 레벨 입니다.=====");
    }
}
