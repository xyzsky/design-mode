package builder;

/**
 * @Author Xyz
 * @Date 2022/1/17
 */

/**
 * Computer 类，相当于建造者模式中的 Product 类
 */
public class Computer {
    private String cpu;
    private String ram;
    private int usbCount;
    private String keyboard;
    private String display;

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                "ram='" + ram + '\'' +
                "usbCount=" + usbCount +
                "keyboard='" + keyboard + '\'' +
                "display='" + display + '\'' +
                '}';
    }
}
