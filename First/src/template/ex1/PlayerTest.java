package template.ex1;

public class PlayerTest {
    public static void main(String[] args) {
        Player a = new Player();
        a.playerGo(1);

        a.setLevel(new MiddleLevel());
        a.playerGo(2);

        a.setLevel(new HighLevel());
        a.playerGo(3);
    }
}
