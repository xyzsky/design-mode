package memorandum;

/**
 * @Author Xyz
 * @Date 2022/7/8
 */
public class GameProgressMemento {
    private int score;

    public GameProgressMemento(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
