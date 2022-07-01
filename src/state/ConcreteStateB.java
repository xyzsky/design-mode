package state;

/**
 * @Author Xyz
 * @Date 2022/7/1
 */
public class ConcreteStateB implements State{
    @Override
    public void doAction(StateContext context) {
        System.out.println("===================现在是状态B======================");
    }
}
