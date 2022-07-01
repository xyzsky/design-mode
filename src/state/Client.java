package state;

/**
 * @Author Xyz
 * @Date 2022/7/1
 */
public class Client {
    public static void main(String[] args) {
        // 本质：通过给类设置不同的对象，以改变类外部显示的行为
        StateContext stateContext = new StateContext();
        // 设置状态
        stateContext.setState(new ConcreteStateA());
        stateContext.doAction();
        // 切换状态
        stateContext.setState(new ConcreteStateB());
        stateContext.doAction();
    }
}
