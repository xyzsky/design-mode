package builder;

/**
 * @Author Xyz
 * @Date 2022/1/17
 */
public class ComputerDirector {
    public void construct(ComputerBuilder computerBuilder) {
        computerBuilder.setUsbCount();
        computerBuilder.setKeyboard();
        computerBuilder.setDisplay();
    }
}
