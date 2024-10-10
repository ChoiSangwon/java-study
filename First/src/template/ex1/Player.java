package template.ex1;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BegginerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void setLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void playerGo(int count) {
        level.go(count);
    }
}
