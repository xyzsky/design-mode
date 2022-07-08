package memorandum;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xyz
 * @Date 2022/7/8
 */
public class GameCareTaker {

    private List<GameProgressMemento> memento = new ArrayList<>();

    public void saveMemento(GameProgressMemento memento) {
        this.memento.add(memento);
    }

    public GameProgressMemento getMemento(int index) {
        return this.memento.get(index);
    }
}
