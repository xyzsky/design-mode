package builder;

/**
 * Builder
 */
public interface ComputerBuilder {
    void setUsbCount();

    void setKeyboard();

    void setDisplay();

    Computer getComputer();
}
