package state;

import java.util.Objects;

/**
 * @Author Xyz
 * @Date 2022/7/1
 */
public class StateContext {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void doAction() {
        Objects.requireNonNull(state);
        state.doAction(this);
    }
}
