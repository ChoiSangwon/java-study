package template.ex1;

public class MiddleLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("turn할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("=====중급 레벨 입니다.=====");
    }
}
