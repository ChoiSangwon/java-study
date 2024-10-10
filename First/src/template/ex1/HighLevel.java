package template.ex1;

public class HighLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("아주 빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("아주 높이 turn 합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("=====고급 레벨 입니다.=====");
    }
}
